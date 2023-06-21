package com.xworkz.parking.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.ParkingEntity;
@Repository
public class ParkingRepositoryImpl implements ParkingRepository {
	
	
	private EntityManagerFactory factoryBean= Persistence.createEntityManagerFactory("com.xworkz") ;
	
	public ParkingRepositoryImpl() {
		System.out.println("No arg const of ParkingRepositoryImpl");
	}

	@Override
   
	public List<ParkingEntity> findByEmailAndPsssword(String email, String password) {
        System.out.println("running findby email and Password" +email);
       
        EntityManager entityManager = factoryBean.createEntityManager();
		Query query = entityManager.createNamedQuery("findByEmailAndPassword");
		List<ParkingEntity> list = query.getResultList();
		System.out.println("list "+list);
		entityManager.close();
		return list;
		
	}

}
