package com.xworkz.collection.movie;

import java.util.Objects;

public class MovieDTO {
	
	private String movieName;
	private String hero;
	private String director;
	private double budget;
	private String producer;
	private int noOfSongs;
	private String singer;
	private String villan;

	public MovieDTO() {
		System.out.println("No arg constructor");
	}

	public MovieDTO(String movieName, String hero, String director, double budget, String producer, int noOfSongs,
			String singer, String villan) {
		super();
		this.movieName = movieName;
		this.hero = hero;
		this.director = director;
		this.budget = budget;
		this.producer = producer;
		this.noOfSongs = noOfSongs;
		this.singer = singer;
		this.villan = villan;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getVillan() {
		return villan;
	}

	public void setVillan(String villan) {
		this.villan = villan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(budget, director, hero, movieName, noOfSongs, producer, singer, villan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MovieDTO other = (MovieDTO) obj;
		return Double.doubleToLongBits(budget) == Double.doubleToLongBits(other.budget)
				&& Objects.equals(director, other.director) && Objects.equals(hero, other.hero)
				&& Objects.equals(movieName, other.movieName) && noOfSongs == other.noOfSongs
				&& Objects.equals(producer, other.producer) && Objects.equals(singer, other.singer)
				&& Objects.equals(villan, other.villan);
	}

	@Override
	public String toString() {
		return "MovieDTO [movieName=" + movieName + ", hero=" + hero + ", director=" + director + ", budget=" + budget
				+ ", producer=" + producer + ", noOfSongs=" + noOfSongs + ", singer=" + singer + ", villan=" + villan
				+ "]";
	}
	
	
	
	
	
	

}
