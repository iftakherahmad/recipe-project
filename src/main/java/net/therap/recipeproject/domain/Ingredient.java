package net.therap.recipeproject.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author iftakhar.ahmed
 * @since 11/18/21
 */
@Entity
@Table(name = "ingredient")
public class Ingredient implements Serializable {

    private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    private BigDecimal amount;

    @OneToOne
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private Recipe recipe;

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.unitOfMeasure = unitOfMeasure;
        this.recipe = recipe;
    }

    public Ingredient(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}