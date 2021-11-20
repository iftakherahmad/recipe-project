package net.therap.recipeproject.repositories;

import net.therap.recipeproject.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author iftakhar.ahmed
 * @since 11/18/21
 */
public interface CategoryRepository extends CrudRepository<Category,Long> {

    Optional<Category> findByDescription(String description);
}