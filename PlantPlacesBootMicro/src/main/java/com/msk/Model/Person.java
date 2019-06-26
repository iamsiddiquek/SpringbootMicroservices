package com.msk.Model;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	private String career;
	private String location;
	private Date birthDate;
	
}
