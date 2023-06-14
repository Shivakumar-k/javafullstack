package com.xworkz.contact.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.xworkz.contact.dto.ContactDTO;
@Repository
public class ContactRepoImpl implements ContactRepository{
	
	public ContactRepoImpl() {
		System.out.println("Running ContactRepoImpl no arg const..");
	}
	
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
	private EntityManager manager=factory.createEntityManager();
	private EntityTransaction transaction = manager.getTransaction();

	@Override
	public boolean save(ContactDTO dto) {
		System.out.println("Running Save in repo");
		transaction.begin();
		manager.persist(dto);
		transaction.commit();
		manager.close();
		return false;
	}

}
