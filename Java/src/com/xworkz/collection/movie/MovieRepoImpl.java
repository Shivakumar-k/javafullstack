package com.xworkz.collection.movie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MovieRepoImpl implements MovieRepo {
		
	private Collection<MovieDTO> movieDTOs = new ArrayList<MovieDTO>();
	
	public MovieRepoImpl() {
		System.out.println("No-arg constructor");
	}
	
	public MovieRepoImpl(Collection<MovieDTO> movieDTOs) {
		this.movieDTOs = movieDTOs;
	}


	@Override
	public boolean save(MovieDTO dto) {
		
		return this.movieDTOs.add(dto);

	}

	@Override
	public Collection<MovieDTO> findbyMovieName(String movieName) {
		
				return this.movieDTOs.stream().filter(e->e.getMovieName().equalsIgnoreCase(movieName)).collect(Collectors.toList());
			}
		
		
	

}
