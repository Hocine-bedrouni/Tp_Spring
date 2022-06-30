package fr.example.tp_spring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="adress")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    @NotNull
    @Size(max=60)
    private String street;

    @Column
    @Size(max=60)
    private String complement;

    @Column
    @NotNull
    @Size(max=30)
    private String city;

    @Column
    @NotNull
    @Size(max=30)
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
