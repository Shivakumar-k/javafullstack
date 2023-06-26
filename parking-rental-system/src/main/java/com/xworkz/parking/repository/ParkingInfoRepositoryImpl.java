package com.xworkz.parking.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.ParkingInfoEntity;
@Repository
public class ParkingInfoRepositoryImpl implements ParkingInfoRepository {
	
	public ParkingInfoRepositoryImpl() {
		System.out.println("running no-arg const int"+getClass().getSimpleName());
	}

	@Override
	public boolean save(ParkingInfoEntity entity) {
		System.out.println("Running save in ParkingInfo");	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		
		return true;
	}

}
