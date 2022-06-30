package fr.example.tp_spring.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="person")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String civility;

    @Column
    private String lastname;

    @Column
    private String firstname;

    @Column
    private String email;

    @OneToOne(targetEntity = Adress.class)
    @JoinColumn(name="adress_id")
    int adress_id;

    @OneToOne(targetEntity = Formateur.class)
    @JoinColumn(name="formateur_id")
    private int formateur_id;

    // Constructeur


    public Person() {
    }

    public Person(Long id, String civility, String lastname, String firstname, String email, int adress_id, int formateur_id) {
        this.id = id;
        this.civility = civility;
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
        this.adress_id = adress_id;
        this.formateur_id = formateur_id;
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

    public int getFormateur_id() {
        return formateur_id;
    }

    public void setFormateur_id(int formateur_id) {
        this.formateur_id = formateur_id;
    }
}
