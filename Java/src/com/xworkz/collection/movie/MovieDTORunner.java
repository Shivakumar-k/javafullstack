package com.xworkz.collection.movie;

import java.util.Collection;

public class MovieDTORunner {

	public static void main(String[] args) {
		
		
		
		MovieDTO Dto = new  MovieDTO("RRR", "Jr.NTR", "Rajamouli", 500, "UV creations", 5, "Rahul", "john");
		MovieDTO Dto1 = new  MovieDTO("Kgf", "yash", "prashanth neel", 200, "hombale", 6, "vijay prakash", "sanjay dutt");
		
		
		MovieRepo repo = new MovieRepoImpl();
		MovieService service = new MovieServiceImpl(repo);
		
		boolean save = service.validateAndSave(Dto);
		System.out.println(save);
		
		Collection<MovieDTO> findByMovieName = service.findbyMovieName("RRR");
		System.out.println(findByMovieName);
		
		boolean save1 = service.validateAndSave(Dto1);
		System.out.println(save1);
		
		Collection<MovieDTO> movie = service.findbyMovieName("KGF");
		System.out.println(movie);
		
		
		


	}

}
