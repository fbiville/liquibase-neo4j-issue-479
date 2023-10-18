package com.example.demo;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface MovieRepository extends Repository<Movie, String> {

    public List<Movie> findByTitle(String title);
}
