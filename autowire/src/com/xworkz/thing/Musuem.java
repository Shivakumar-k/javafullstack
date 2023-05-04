package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Component
@ToString
@AllArgsConstructor

public class Musuem {
	@Autowired
	private String musuemName;

	@Autowired
	private EntryFee entryFee;
}
