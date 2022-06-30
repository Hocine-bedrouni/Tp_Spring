package fr.example.tp_spring.repository;

import fr.example.tp_spring.entity.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatiereRepo extends JpaRepository<Matiere, Long> {

//    public List<Matiere> findById(Long id);
}
