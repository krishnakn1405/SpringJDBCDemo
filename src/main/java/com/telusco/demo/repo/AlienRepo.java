package com.telusco.demo.repo;

import com.telusco.demo.model.Alien;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepo {

    public void save(Alien alien) {
        System.out.println("Added");
    }

    public List<Alien> findAll() {
        return new ArrayList<Alien>();
    }
}
