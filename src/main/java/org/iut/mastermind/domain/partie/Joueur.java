package org.iut.mastermind.domain.partie;

import java.util.Objects;

public class Joueur {

    private final String nom;

    // constructeur
    public Joueur(String nom) {
        this.nom = nom;
    }

    // getter nom joueur
    public String getNom() {
        return this.nom;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (o instanceof Joueur) {
            Joueur j = (Joueur) o;
            return this.nom.equals(j.nom);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
