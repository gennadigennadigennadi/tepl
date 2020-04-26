package com.gennadigennadigennadi.tepl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class Recipe {
    @Id
    public UUID uuid;
    public String name;
    public String image;

    @OneToMany()
    public List<Ingredient> ingredientList;
}
