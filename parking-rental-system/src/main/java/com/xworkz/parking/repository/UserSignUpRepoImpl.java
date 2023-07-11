package com.xworkz.parking.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.parking.entity.UserSignUpEntity;

public class UserSignUpRepoImpl implements UserSignUpRepo {
	@Autowired
	private EntityManagerFactory factory;

	@Override
	public boolean save(UserSignUpEntity entity) {
		System.out.println("Running save method in UserSignUpRepo");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction entityTransaction = manager.getTransaction();
		entityTransaction.begin();
		manager.persist(entity);
		entityTransaction.commit();
		manager.close();
		return true;
	}

	@Override
	public List<UserSignUpEntity> findByEmail(String email) {
		System.out.println("Running findByEmail method in UserSignUpRepo");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByUserSignUpEmail");
		query.setParameter("byUserSignUpEmail", email);
		List<UserSignUpEntity> result = query.getResultList();
		System.out.println("Results: "+result);
		manager.close();
		return result;
		
	
	}
		
}
