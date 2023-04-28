package com.xworkz.collection.movie;

import static com.xworkz.collection.movie.MovieValidation.*;
import static com.xworkz.crud.god.validation.GodValidation.validFlag;

import java.util.Collection;

public class MovieServiceImpl implements MovieService {
	
	private MovieRepo repo;
	
	public MovieServiceImpl(MovieRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(MovieDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null, we can validate and save");
			
			String movieName = dto.getMovieName();
			String hero = dto.getHero();
			String director = dto.getDirector();
			double budget = dto.getBudget();
			String producer = dto.getProducer();
			int noOfSongs = dto.getNoOfSongs();
			String singer = dto.getSinger();
			String villan = dto.getVillan();
			
			
			boolean validMovieName = false;
			boolean validHero = false;
			boolean ValidDirector = false;
			boolean validBudget = false;
			boolean validProducer = false;
			boolean validNoOfSongs = false;
			boolean validSinger = false;
			boolean validVillan = false;
			
			if(validString(movieName)) {
				System.out.println("valid Name");
				validMovieName = true;
			}else {
				System.out.println("Invalid Name");
			}
			
			if(validString(hero)) {
				System.out.println("valid hero");
				validHero = true;
			}else {
				System.out.println("Invalid hero");
			}
			if(validString(director)) {
				System.out.println("valid director");
				ValidDirector = true;
			}else {
				System.out.println("Invalid director");
			}
			if(validDouble(budget)) {
				System.out.println("valid budget");
				validBudget = true;
			}else {
				System.out.println("Invalid budget");
			}
			if(validString(producer)) {
				System.out.println("valid producer");
				validProducer = true;
			}else {
				System.out.println("Invalid producer");
			}
			if(validInt(noOfSongs)) {
				System.out.println("valid noOfSongs");
				validBudget = true;
			}else {
				System.out.println("Invalid noOfSongs");
			}
			if(validString(singer)) {
				System.out.println("valid singer");
				validSinger = true;
			}else {
				System.out.println("Invalid singer");
			}
			if(validString(villan)) {
				System.out.println("valid villan");
				validVillan = true;
			}else {
				System.out.println("Invalid villan");
			}
			if(validFlag(validMovieName,validHero,ValidDirector,validBudget,validProducer,validNoOfSongs,validSinger,validVillan )) {
				System.out.println("data is valid we can save the data");
				boolean save = this.repo.save(dto);
				return true;
			}
			else
			{
				System.out.println("data is Invalid we cannot save the data");	
			}
			
		}
		else
		{
			System.out.println("dto is null");
		}
		
		return false;
	}

	@Override
	public Collection<MovieDTO> findbyMovieName(String movieName) {
		
		return this.repo.findbyMovieName(movieName);
	}

}
