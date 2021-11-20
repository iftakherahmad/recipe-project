package net.therap.recipeproject.service;

import net.therap.recipeproject.domain.Recipe;
import net.therap.recipeproject.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author iftakhar.ahmed
 * @since 11/20/21
 */
@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes=new HashSet<>();
        recipeRepository.findAll().forEach(recipes::add);
        return recipes;
    }
}
