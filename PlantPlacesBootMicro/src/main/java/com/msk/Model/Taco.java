package com.msk.Model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {

	private Long id;
	
	private Date createdAt;
	
	@NotNull
	@Size(min = 4, message = "Name must be grater than 4 characters")
	private String name;

	@NotNull
	@Size(min = 1, message="At least any one Ingredient must be selected.")
	private List<String> ingredients;


}
