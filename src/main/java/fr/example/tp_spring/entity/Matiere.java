package fr.example.tp_spring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    @Size(max=30)
    private String name;

    @Column
    @NotNull
    @Size(max=30)
    private int duration;

    @Column
    @NotNull
    @Size(max=60)
    private String difficulty;

    //Constructor


    public Matiere() {
    }

    public Matiere(Long id, String name, int duration, String difficulty) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    // Getteurs et Setteurs

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }


}
