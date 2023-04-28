package com.xworkz.collection.snake;

import java.util.Optional;

public class SnakeDTORunner {

	public static void main(String[] args) {

		SnakeRepo repo = new SnakeRepoImpl();
		SnakeService service = new SnakeServiceImpl(repo);

		SnakeDTO Dto1 = new SnakeDTO(1, "cobra", Type.VENOMOUS, "amazon");

		boolean save = service.validateAndSave(Dto1);
		System.out.println(save);

		Optional<SnakeDTO> optionalById = service.findById(1);
		if (optionalById.isPresent()) {
			System.out.println("Snake exist");
			SnakeDTO optional = optionalById.get();
			System.out.println(optional);
		} else {
			System.out.println("Snake does not exist");
		}

		Optional<SnakeDTO> OptionalByName = service.findByName("cobra");
		if (OptionalByName.isPresent()) {
			System.out.println("snake exist for name ");
			SnakeDTO optional = OptionalByName.get();
			System.out.println(optional);
		}

		Optional<SnakeDTO> OptionalByNameAndPlace = service.findByNameAndPlace("cobra", "amazon");
		if (OptionalByNameAndPlace.isPresent()) {
			System.out.println("snake exist for name and place");
			SnakeDTO optional = OptionalByNameAndPlace.get();
			System.out.println(optional);
		}
	}

}
