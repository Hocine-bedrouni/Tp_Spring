package fr.example.tp_spring.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="formateur")
@DiscriminatorValue("Formateur")
@PrimaryKeyJoinColumn(name="formateur_id", referencedColumnName="id")
public class Formateur extends Person {

    @Column
    @NotNull
    @Size(max=15)
    private Date hiredate;

    @Column
    @NotNull
    @Size(max=30)
    private int experience;

    @Column
    @NotNull
    private boolean interne;

    @OneToMany
    @JoinColumn(name="formateur_id")
    private List<Stagiaire> stagiaireList;

    @OneToMany
    @JoinColumn(name="formateur_id")
    private List<Matiere> matiereList;

    //Constructor
    public Formateur() {
        super();
    }

    public Formateur(Long id, String civility, String lastname, String firstname, String email, int adress_id, Date hiredate, int experience, boolean interne, List<Stagiaire> stagiaireList, List<Matiere> matiereList) {
        super(id, civility, lastname, firstname, email, adress_id);
        this.hiredate = hiredate;
        this.experience = experience;
        this.interne = interne;
        this.stagiaireList = stagiaireList;
        this.matiereList = matiereList;
    }

    //Getteurs et Setteurs


    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public boolean isInterne() {
        return interne;
    }

    public void setInterne(boolean interne) {
        this.interne = interne;
    }

    public List<Stagiaire> getStagiaireList() {
        return stagiaireList;
    }

    public void setStagiaireList(List<Stagiaire> stagiaireList) {
        this.stagiaireList = stagiaireList;
    }

    public List<Matiere> getMatiereList() {
        return matiereList;
    }

    public void setMatiereList(List<Matiere> matiereList) {
        this.matiereList = matiereList;
    }


}
