package main;

import classes.Guerreiro;

public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro1 = new Guerreiro(
                "Arthur",
                10,
                150,
                "Espada"
        );

        Guerreiro guerreiro2 = new Guerreiro(
                "Conan",
                8,
                120,
                "Machado"
        );

        // Chamadas dos métodos
        guerreiro1.atacar();
        guerreiro1.atacar(30);
        guerreiro1.atacar(50, "Dragao");

        System.out.println();

        // Comparação de vida
        if (guerreiro1.getPontosDeVida() > guerreiro2.getPontosDeVida()) {
            System.out.println(guerreiro1.getNome() + " esta em melhor estado.");
        } else if (guerreiro2.getPontosDeVida() > guerreiro1.getPontosDeVida()) {
            System.out.println(guerreiro2.getNome() + " esta em melhor estado.");
        } else {
            System.out.println("Os dois guerreiros estao com a mesma quantidade de vida.");
        }
    }
}