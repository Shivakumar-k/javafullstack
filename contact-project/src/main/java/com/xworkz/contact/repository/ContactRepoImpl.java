package com.xworkz.contact.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.contact.entity.ContactEntity;
@Component
@Repository
public class ContactRepoImpl implements ContactRepository {
	
	@Autowired
	private EntityManagerFactory factoryBean;

	public ContactRepoImpl() {
		System.out.println("Running ContactRepoImpl no arg const..");
	}

	@Override
	public boolean save(ContactEntity entity) {
		
		EntityManager manager = factoryBean.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println("Running Save in repo");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}
	
	@Override
	public List<ContactEntity> findByName(String name) {
		System.out.println("Running findByName in repo.."+name);
		EntityManager entityManager = factoryBean.createEntityManager();
		Query query = entityManager.createNamedQuery("findByName");
		query.setParameter("nm", "%"+name+"%");
		List<ContactEntity> result = query.getResultList();
		System.out.println("result from repo" + result);
		entityManager.close();
		return result;
	}

}
