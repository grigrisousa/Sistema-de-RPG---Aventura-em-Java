package br.com.rpg.principal;

import br.com.rpg.modelo.Guerreiro;
import br.com.rpg.modelo.Mago;
import br.com.rpg.modelo.Arqueiro;
import br.com.rpg.modelo.Personagem;
import br.com.rpg.sistema.Arena;

/**
 * Classe principal do jogo RPG.
 */
public class JogoRPG {

    public static void main(String[] args) {
        System.out.println("=== BEM-VINDO AO JOGO DE RPG ===");
        System.out.println();

        // Criação dos personagens
        Guerreiro guerreiro = new Guerreiro("Arthur");
        Mago mago = new Mago("Merlin");
        Arqueiro arqueiro = new Arqueiro("Legolas");

        System.out.println("Personagens criados:");
        System.out.println("- " + guerreiro.getNome() + " (Guerreiro) - Vida: " + guerreiro.getVida() + ", Força: " + guerreiro.getForca());
        System.out.println("- " + mago.getNome() + " (Mago) - Vida: " + mago.getVida() + ", Força: " + mago.getForca());
        System.out.println("- " + arqueiro.getNome() + " (Arqueiro) - Vida: " + arqueiro.getVida() + ", Força: " + arqueiro.getForca());
        System.out.println();

        // Batalha entre Guerreiro e Mago
        Arena.iniciarBatalha(guerreiro, mago);
    }
}