package com.xworkz.studentJpa.repo;

import java.awt.geom.QuadCurve2D;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.xworkz.studentJpa.entity.StudentEntity;

public class StudentRepository {

	public boolean save(StudentEntity entity) {
		System.out.println("Running save method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

	public List<StudentEntity> findAll() {
		System.out.println("Running save method");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");

		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Query q = manager.createNamedQuery("findAll");
		return q.getResultList();
	}
}
