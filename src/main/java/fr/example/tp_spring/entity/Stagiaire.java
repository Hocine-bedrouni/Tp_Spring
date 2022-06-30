package fr.example.tp_spring.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="stagiaire")
@DiscriminatorValue("Stagiaire")
public class Stagiaire extends Person{

    @Column
    Date birthdate;

    @OneToOne(targetEntity = Formateur.class)
    @JoinColumn(name="formateur_id")
    private int formateur_id;

    // Constructeur


    public Stagiaire() {
    }

    public Stagiaire(Long id, String civility, String lastname, String firstname, String email, int adress_id, int formateur_id, Date birthdate, int formateur_id1) {
        super(id, civility, lastname, firstname, email, adress_id, formateur_id);
        this.birthdate = birthdate;
        this.formateur_id = formateur_id1;
    }

    // Getteurs et Setteurs


    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public int getFormateur_id() {
        return formateur_id;
    }

    @Override
    public void setFormateur_id(int formateur_id) {
        this.formateur_id = formateur_id;
    }
}
