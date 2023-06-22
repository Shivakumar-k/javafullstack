package com.xworkz.parking.repository;

import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.ParkingEntity;

@Repository
public class ParkingRepositoryImpl implements ParkingRepository {

	private EntityManagerFactory factoryBean = Persistence.createEntityManagerFactory("com.xworkz");

	public ParkingRepositoryImpl() {
		System.out.println("No arg const of ParkingRepositoryImpl");
	}

	@Override

	public List<ParkingEntity> findAll() {
		System.out.println("running findAll");

		EntityManager entityManager = factoryBean.createEntityManager();
		try {
			
			Query query = entityManager.createNamedQuery("findAll");
			System.out.println("Executing query");
			List<ParkingEntity> list=query.getResultList();
            System.out.println("LIst------------------------ "+list);
			return list ;
		}
//		List<ParkingEntity> list = query.getResultList();
//		System.out.println("list "+list);
		
		catch (PersistenceException e) {
			e.printStackTrace();
		}
		finally {
			entityManager.close();
		}
		return Collections.emptyList();
		
	}

}
