package com.xworkz.collection.snake;

import java.util.Optional;

public class SnakeServiceImpl implements SnakeService {

	private SnakeRepo repo;

	public SnakeServiceImpl(SnakeRepo repo) {

		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(SnakeDTO dto) {
		if (dto != null) {
			return this.repo.save(dto);
		}
		return false;
	}

	@Override
	public Optional<SnakeDTO> findById(int id) {

		return this.repo.findById(id);
	}

	public Optional<SnakeDTO> findByName(String name) {
		return this.repo.findByName(name);
	}

	public Optional<SnakeDTO> findByNameAndPlace(String name, String place) {
		return this.repo.findByNameAndPlace(name, place);
	}

}
