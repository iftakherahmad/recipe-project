package net.therap.recipeproject.repositories;

import net.therap.recipeproject.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author iftakhar.ahmed
 * @since 11/18/21
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}