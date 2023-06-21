package com.xworkz.newsLetter.service;

import com.xworkz.newsLetter.dto.NewsLetterDTO;

public interface NewsLetterService {
	
	
	boolean validateAndSave(NewsLetterDTO dto);

}
