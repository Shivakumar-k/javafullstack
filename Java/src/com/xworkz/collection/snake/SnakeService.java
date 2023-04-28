package com.xworkz.collection.snake;

import java.util.Optional;

public interface SnakeService {

	boolean validateAndSave(SnakeDTO dto);

	Optional<SnakeDTO> findById(int id);

	default Optional<SnakeDTO> findByName(String name) {
		return Optional.empty();
	}

	default Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return Optional.empty();
	}

}
