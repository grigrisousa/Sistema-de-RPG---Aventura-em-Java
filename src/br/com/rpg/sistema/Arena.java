package br.com.rpg.sistema;

import br.com.rpg.modelo.Personagem;

/**
 * Sistema de batalha entre personagens.
 */
public class Arena {

    /**
     * Realiza uma batalha entre dois personagens.
     */
    public static void iniciarBatalha(Personagem p1, Personagem p2) {
        System.out.println("=== BATALHA INICIADA ===");
        System.out.println(p1.getNome() + " (" + p1.getTipo() + ") VS " + p2.getNome() + " (" + p2.getTipo() + ")");
        System.out.println();

        int turno = 1;

        while (p1.estaVivo() && p2.estaVivo()) {
            System.out.println("--- Turno " + turno + " ---");

            // Turno do primeiro personagem
            p1.atacar(p2);
            System.out.println();

            if (!p2.estaVivo()) {
                System.out.println(p2.getNome() + " foi derrotado!");
                System.out.println(p1.getNome() + " VENCEU A BATALHA!");
                break;
            }

            // Turno do segundo personagem
            p2.atacar(p1);
            System.out.println();

            if (!p1.estaVivo()) {
                System.out.println(p1.getNome() + " foi derrotado!");
                System.out.println(p2.getNome() + " VENCEU A BATALHA!");
                break;
            }

            System.out.println();
            turno++;
        }

        System.out.println("=== BATALHA ENCERRADA ===");
    }
}