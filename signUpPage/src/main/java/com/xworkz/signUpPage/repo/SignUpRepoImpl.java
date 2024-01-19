package com.xworkz.signUpPage.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.stereotype.Component;

import com.xworkz.signUpPage.entity.SignUpEntity;
@Component
public class SignUpRepoImpl implements SignUpRepo {
	
	private EntityManagerFactory factory;

	@Override
	public boolean save(SignUpEntity entity) {
		System.out.println("Running save method in Repo");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

}
