package com.msk.data;

import java.util.List;

import com.msk.Model.Person;

public interface PersonRepository {

	public List<Person> findAll();
	
}
