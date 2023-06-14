package com.xworkz.mall.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.mall.dto.MallDTO;
import com.xworkz.mall.entity.MallEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MallSeviceImpl implements MallService{
    @Override
	public boolean validateAndSave(MallDTO dto) {
		log.info("running validate And save");
		MallEntity entity = new MallEntity();
		BeanUtils.copyProperties(dto, entity);
		log.info(""+entity);
		return true;
	}
	 

	

}
