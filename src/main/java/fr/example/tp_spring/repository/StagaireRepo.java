package fr.example.tp_spring.repository;

import fr.example.tp_spring.entity.Formateur;
import fr.example.tp_spring.entity.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StagaireRepo extends JpaRepository <Stagiaire, Long>{



}
