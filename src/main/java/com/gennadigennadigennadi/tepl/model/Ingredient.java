package com.gennadigennadigennadi.tepl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Ingredient {

    @Id
    public UUID uuid;
    public String name;

    public Ingredient() {
        uuid = UUID.randomUUID();
    }
}
