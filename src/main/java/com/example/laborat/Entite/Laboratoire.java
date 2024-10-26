package com.example.laborat.Entite;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="laboratoire")
public class Laboratoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;
    private String logo;
    private String nrc;
    private boolean active;

    @Column(name = "date_activation")
    private LocalDate dateActivation;

    public Laboratoire() {
    }

    public Laboratoire(String nom, String logo, String nrc, boolean active, LocalDate dateActivation) {
        this.nom = nom;
        this.logo = logo;
        this.nrc = nrc;
        this.active = active;
        this.dateActivation = dateActivation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNrc() {
        return nrc;
    }

    public void setNrc(String nrc) {
        this.nrc = nrc;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getDateActivation() {
        return dateActivation;
    }

    public void setDateActivation(LocalDate dateActivation) {
        this.dateActivation = dateActivation;
    }
}
