package fr.example.tp_spring.repository;

import fr.example.tp_spring.entity.Formateur;
import fr.example.tp_spring.entity.Matiere;
import fr.example.tp_spring.entity.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormateurRepo extends JpaRepository <Formateur, Long>{

    public List<Stagiaire> findByFirstName(String firstName);
    public List<Matiere> findByName (String name);
}
