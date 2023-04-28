package com.xworkz.collection.movie;

import java.util.Collection;

public interface MovieService {
	
	boolean validateAndSave(MovieDTO dto);
	
	Collection<MovieDTO> findbyMovieName(String movieName);

}
