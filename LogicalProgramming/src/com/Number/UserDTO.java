package com.Number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserDTO {

	private int id;
	private String username;
	private String email;

	public UserDTO(int id, String username, String email) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", username=" + username + ", email=" + email + "]";
	}

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Abhi", "pass", "abhi@mail.com"));
		users.add(new User(1, "Shiva", "pass", "shiva@mail.com"));
		users.add(new User(1, "Vinod", "pass", "vinod@mail.com"));
		
		System.out.println(users);

		List<UserDTO> usersDtos = users.stream()
				.map((User user) -> new UserDTO(user.getId(), user.getUsername(), user.getEmail()))
				.collect(Collectors.toList());
		
		System.out.println(usersDtos);
		
		usersDtos.forEach(System.out::println);
		
		for(User user:users) {
			System.out.println(user);
		}
		
		for(UserDTO userDtos:usersDtos) {
			System.out.println(userDtos);
		}
		
		System.out.println("------Distnict-----------");
		
	List<String> u=users.stream().map(User::getPassword).distinct().collect(Collectors.toList());
	System.out.println(u);
	
	users.stream().map(User::getEmail).distinct().forEach(System.out::println);
	
	long c =users.stream().map(User::getEmail) .distinct().count();
	System.out.println( "count: "+c);
//	
//	String input ="hello";
//	List<Character> result=Arrays.stream(input.split("")).mapToInt(x->x.charAt(0))
//			                  .filter(i->i%2==0).boxed().collect(Collectors.toList());
	

	}

}
