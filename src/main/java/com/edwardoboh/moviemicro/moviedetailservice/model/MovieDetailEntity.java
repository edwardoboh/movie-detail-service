package com.edwardoboh.moviemicro.moviedetailservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class MovieDetailEntity {
    @Id
    private String id;
    private String description;

    public MovieDetailEntity () {}

    public MovieDetailEntity(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "MovieDetailEntity{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}