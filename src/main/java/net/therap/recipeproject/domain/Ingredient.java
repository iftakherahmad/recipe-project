package net.therap.recipeproject.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author iftakhar.ahmed
 * @since 11/18/21
 */
@Entity
public class Ingredient implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private Long amount;

    @OneToOne
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private Recipe recipe;
}