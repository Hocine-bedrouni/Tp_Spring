package fr.example.tp_spring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="stagiaire")
@DiscriminatorValue("Stagiaire")
@PrimaryKeyJoinColumn(name="stagiaire_id", referencedColumnName="id")
public class Stagiaire extends Person{

    @Column
    @NotNull
    @Size(max=15)
    Date birthdate;

    @OneToOne(targetEntity = Formateur.class)
    @JoinColumn(name="formateur_id")
    private int formateur_id;

    // Constructeur


    public Stagiaire() {
    }

    public Stagiaire(Long id, String civility, String lastname, String firstname, String email, int adress_id, Date birthdate, int formateur_id) {
        super(id, civility, lastname, firstname, email, adress_id);
        this.birthdate = birthdate;
        this.formateur_id = formateur_id;
    }

    // Getteurs et Setteurs


    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
