package com.gennadigennadigennadi.tepl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Units {

    @Id
    private UUID uuid;

    public String name;


}
