package org.iut.mastermind.domain.partie;

import java.util.Objects;

public class Joueur {

    private final String nom;

    // constructeur
    public Joueur(String nom) {
        this.nom = nom;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (o instanceof Joueur) {
            return this.nom.equals(((Joueur) o).nom);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nom);
    }
}
