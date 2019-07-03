package com.msk.Model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Blogs {

	private int id;
	private String title;
	private int categoryId;
	private int userId;
	private String description;
	private String image;
	private boolean isFeatured;
	private boolean isActive;
	private Date createdAt;
	
	
}
