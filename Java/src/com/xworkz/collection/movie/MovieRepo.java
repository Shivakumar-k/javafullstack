package com.xworkz.collection.movie;

import java.util.Collection;

public interface MovieRepo {
	
	boolean save(MovieDTO dto);
	
	Collection<MovieDTO>  findbyMovieName(String movieName);
	
}
