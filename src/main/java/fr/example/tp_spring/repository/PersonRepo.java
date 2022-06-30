package fr.example.tp_spring.repository;

import fr.example.tp_spring.entity.Adress;

import java.util.List;

public interface PersonRepo {

    public List<Adress> findById(Long id);
}
