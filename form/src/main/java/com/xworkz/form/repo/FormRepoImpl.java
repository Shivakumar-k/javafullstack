package com.xworkz.form.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.xworkz.form.entity.FormEntity;
@Component
@Repository
public class FormRepoImpl implements FormRepo {
	
	@Autowired
	private EntityManagerFactory factoryBean;

	public FormRepoImpl() {
		System.out.println("running FormRepoImpl const..");
	}

	@Override
	public boolean save(FormEntity entity) {
		System.out.println("Running save method in RepoImpl");
		EntityManager manager=factoryBean.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		System.out.println("Running Save in repo");
		transaction.begin();
		manager.persist(entity);
		transaction.commit();
		manager.close();
		return true;
	}

}
