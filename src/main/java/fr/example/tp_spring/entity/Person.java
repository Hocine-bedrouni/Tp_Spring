package fr.example.tp_spring.entity;


import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name="person")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="TYPE_PERSONNE")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull
    @Size(max=20)
    private String civility;

    @Column
    @NotNull
    @Size(max=50)
    private String lastname;

    @Column
    @NotNull
    @Size(max=50)
    private String firstname;

    @Column
    @NotNull
    @Size(max=60)
    private String email;

    @OneToOne(targetEntity = Adress.class)
    @JoinColumn(name="adress_id")
    int adress_id;


    // Constructeur


    public Person() {
    }

    public Person(Long id, String civility, String lastname, String firstname, String email, int adress_id) {
        this.id = id;
        this.civility = civility;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.adress_id = adress_id;
    }

    // Getteurs et Setteurs


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCivility() {
        return civility;
    }

    public void setCivility(String civility) {
        this.civility = civility;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAdress_id() {
        return adress_id;
    }

    public void setAdress_id(int adress_id) {
        this.adress_id = adress_id;
    }
}
