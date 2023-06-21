package com.xworkz.studentJpa.boot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.studentJpa.entity.StudentEntity;

public class StudentJpaRunner {
	
	public static StudentEntity entity;
	
	public StudentJpaRunner() {
		System.out.println("no arg const of runner");
	}

	public static void main(String[] args) {
		
		System.out.println("Running main method in jpa runner");
		
				EntityManagerFactory factoryBean = Persistence.createEntityManagerFactory("com.xworkz");
//		System.out.println("factory");
//		EntityManager manager = factory.createEntityManager();
//		System.out.println("manager");
//		manager.getTransaction().begin();
//		System.out.println("begin");
		
		EntityManager manager = factoryBean.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println("Running Save in repo");
		transaction.begin();
		try {
			manager.persist(entity);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		transaction.commit();
//		manager.close();
		
		
		StudentEntity s =new StudentEntity();
		s.setId(1);
		s.setName("Shiva");
		s.setAge(22);
		manager.getTransaction().commit();
		
		manager.close();
		
		
		
	}
}
