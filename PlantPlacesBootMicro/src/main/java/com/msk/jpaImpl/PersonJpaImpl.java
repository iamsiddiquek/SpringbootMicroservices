package com.msk.jpaImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.msk.Model.Person;
import com.msk.data.PersonRepository;

@Repository
@Transactional
public class PersonJpaImpl implements PersonRepository {

	
	@PersistenceContext
	EntityManager repository;
	
	
	public Person findById(int id) {
		return repository.find(Person.class, id);
	}
	
	
	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
