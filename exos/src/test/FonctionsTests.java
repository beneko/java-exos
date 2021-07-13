package test;

import org.afpa.model.Fonctions;

import org.junit.Assert;
import org.junit.Test;

public class FonctionsTests {

    @Test
    public void compteLettreTest() {

        String str = "Hello guys, How are you";
        String lettre = "H";
        int nombre = Fonctions.compteLettre(str,lettre);
        System.out.printf("Il y a %d lettre(s) de %s dans la phrase.", nombre, lettre);
        Assert.assertEquals(2,nombre);
    }

}