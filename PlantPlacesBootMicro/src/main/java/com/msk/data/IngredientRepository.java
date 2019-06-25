package com.msk.data;

import com.msk.Model.Ingredient;

public interface IngredientRepository {

	
	Iterable<Ingredient> findAll();
	
	Ingredient findOne(String id);
	
	Ingredient save(Ingredient ingredient);
	
}
