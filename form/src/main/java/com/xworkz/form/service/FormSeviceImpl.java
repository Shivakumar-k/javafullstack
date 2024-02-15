package com.xworkz.form.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.form.dto.FormDTO;
import com.xworkz.form.entity.FormEntity;
import com.xworkz.form.repo.FormRepo;
@Service
@Component

public class FormSeviceImpl implements FormService  {
	@Autowired
	private FormRepo formRepo;
	
	public FormSeviceImpl() {
		System.out.println("Running FormSeviceImpl const...");
	}

	@Override
	public boolean validateAndSave(FormDTO dto) {
		System.out.println("Running  validateAndSave "+getClass().getSimpleName());
		FormEntity entity = new FormEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println(" "+entity);
		boolean save=this.formRepo.save(entity);
		return true;
	}

}
