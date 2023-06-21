package com.xworkz.newsLetter.service;

import org.springframework.stereotype.Service;

import com.xworkz.newsLetter.dto.NewsLetterDTO;
@Service
public class NewsLetterServiceImpl implements NewsLetterService {
	
	public NewsLetterServiceImpl() {
		System.out.println("Running NewsLetterServiceImpl no-arg const");
	}

	@Override
	public boolean validateAndSave(NewsLetterDTO dto) {
		System.out.println("Running validate and save method");
		return true;
	}

}
