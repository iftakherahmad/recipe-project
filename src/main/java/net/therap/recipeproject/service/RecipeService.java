package net.therap.recipeproject.service;

import net.therap.recipeproject.domain.Recipe;

import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/18/21
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
