package com.xworkz.parking.repository;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.ParkingEntity;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {

	public ParkingRepositoryImpl() {
		System.out.println("No arg const of ParkingRepositoryImpl");
	}

	@Override
	public List<ParkingEntity> findAll() {
		System.out.println("running findAll");
		EntityManagerFactory factoryBean = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = factoryBean.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findAll");
			System.out.println("Executing query");
			List<ParkingEntity> list = query.getResultList();
			System.out.println("List------------------------ " + list);
			return list;
		}
//		List<ParkingEntity> list = query.getResultList();
//		System.out.println("list "+list);

		catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			entityManager.close();
		}
		return Collections.emptyList();

	}

	@Override
	public List<ParkingEntity> findByEmail(String email) {
		System.out.println("Running findByEmail in repo: " + email);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByEmail");
		query.setParameter("byEmail", email);
		List<ParkingEntity> entities = query.getResultList();
		return entities;
	}

	@Override
	public boolean updateLoginTime(String email, LocalDateTime dateTime) {
		System.out.println("Running updateLoginTime");
		EntityManagerFactory factoryBean = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager entityManager = factoryBean.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();

		Query query = entityManager.createNamedQuery("updateLogingTime");
		query.setParameter("updatedTime", dateTime);
		query.setParameter("byEmail", email);
		query.executeUpdate();
		transaction.commit();
		entityManager.close();
		return true;
	}

}
