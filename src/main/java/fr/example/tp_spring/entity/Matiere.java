package fr.example.tp_spring.entity;

import javax.persistence.*;

@Entity
@Table(name="matiere")
public class Matiere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private int duration;

    @Column
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
