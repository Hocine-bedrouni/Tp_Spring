package fr.example.tp_spring.entity;

import javax.persistence.*;

@Entity
@Table(name="adress")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String street;

    @Column
    private String complement;

    @Column
    private String city;

    @Column
    private String country;

    //Constructor
    public Adress() {
    }

    public Adress(int id, String street, String complement, String city, String country) {
        this.id = id;
        this.street = street;
        this.complement = complement;
        this.city = city;
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
