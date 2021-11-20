package net.therap.recipeproject.repositories;

import net.therap.recipeproject.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author iftakhar.ahmed
 * @since 11/18/21
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}