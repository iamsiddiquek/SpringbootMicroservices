package com.msk.jpaImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.msk.Model.Course;

@Repository
@Transactional
public class CourseRepository {

	
	@Autowired
	@PersistenceContext
	private EntityManager em;
	
	
	public Course findById(int id) {
		return em.find(Course.class, id);
	}
	
	
}
