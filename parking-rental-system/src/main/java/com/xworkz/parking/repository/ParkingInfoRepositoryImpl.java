package com.xworkz.parking.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.xworkz.parking.entity.ParkingInfoEntity;

@Repository
public class ParkingInfoRepositoryImpl implements ParkingInfoRepository {

	public ParkingInfoRepositoryImpl() {
		System.out.println("running no-arg const int" + getClass().getSimpleName());
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

	@Override
	public List<ParkingInfoEntity> findByLocation(String location) {
		System.out.println("Running findByLocation: " + location);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByLocation");
		query.setParameter("byLocation", "%" + location + "%");
		List<ParkingInfoEntity> result = query.getResultList();
		System.out.println("result from repo" + result);
		manager.close();

		return result;
	}

	@Override
	public ParkingInfoEntity findByVariables(String location, String vehicleType, String vehicleBrand,
			String vehicleFuelType, String rentalTerms) {
		System.out.println("Running findByVariables in parkingInfoRepo");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createNamedQuery("findByAll");
		query.setParameter("lc", location);
		query.setParameter("type", vehicleType);
		query.setParameter("brand", vehicleBrand);
		query.setParameter("fuel", vehicleFuelType);
		query.setParameter("days", rentalTerms);

		try {
			Object obj = query.getSingleResult();
			return (ParkingInfoEntity) obj;
		} catch (Exception e) {
			System.out.println("repo: no entity found");
			return null;
		} finally {
			manager.close();
		}

	}

}
