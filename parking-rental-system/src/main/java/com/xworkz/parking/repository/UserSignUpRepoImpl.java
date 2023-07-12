package com.xworkz.parking.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.UserSignUpEntity;
@Repository
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
	public UserSignUpEntity findByEmail(String email) {
		System.out.println("Running findByEmail method in UserSignUpRepo");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByUserSignUpEmail");
		query.setParameter("byUserSignUpEmail", email);
		try {
			Object object = query.getSingleResult();
			UserSignUpEntity entity = (UserSignUpEntity) object;
			return entity;
		} catch (Exception e) {
			return null;
		}

	}
	@Override
	public boolean updateOtpByEmail(String email, String otp) {
		System.out.println("Running updateOtpByEmail in  UserSignUpRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query query = manager.createNamedQuery("updateOtp");
		query.setParameter("updateOtp", otp);
		query.setParameter("byUserSignUpEmail", email);
		query.executeUpdate();
		transaction.commit();
		manager.close();
		return true;
	}
	@Override
	public UserSignUpEntity findByOTP(String otp) {
		System.out.println("Running findByEmail in  UserSignUpRepositoryImpl");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByOTP");
		query.setParameter("byUserOtp", otp);

		Object object = query.getSingleResult();
		if (object != null) {
			UserSignUpEntity entity = (UserSignUpEntity) object;
			return entity;
		} else {
			return null;
		}

	}

}
