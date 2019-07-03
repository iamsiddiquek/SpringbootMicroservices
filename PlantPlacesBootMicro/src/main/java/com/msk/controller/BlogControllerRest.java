package com.msk.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msk.Model.Blogs;

@RestController
public class BlogControllerRest {

	@GetMapping(value = "/blogs")
	public List<Blogs> getBlogs() {

		List<Blogs> blogs = Arrays.asList(
				new Blogs(1, "blog1", 1, 1, "Description 1", "image 1", true, true, new Date()),
				new Blogs(1, "blog1", 1, 1, "Description 1", "image 1", true, true, new Date()));
		return blogs;

	}

}
