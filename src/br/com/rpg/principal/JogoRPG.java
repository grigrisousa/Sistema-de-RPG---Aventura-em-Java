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
        System.out.println("- " + guerreiro.getNome() + " (" + guerreiro.getTipo() + ") - Vida: " + guerreiro.getVida() + ", Mana: " + guerreiro.getMana() + "/" + guerreiro.getManaMaxima() + ", Força: " + guerreiro.getForca() + ", Defesa: " + guerreiro.getDefesa());
        System.out.println("- " + mago.getNome() + " (" + mago.getTipo() + ") - Vida: " + mago.getVida() + ", Mana: " + mago.getMana() + "/" + mago.getManaMaxima() + ", Força: " + mago.getForca() + ", Defesa: " + mago.getDefesa());
        System.out.println("- " + arqueiro.getNome() + " (" + arqueiro.getTipo() + ") - Vida: " + arqueiro.getVida() + ", Mana: " + arqueiro.getMana() + "/" + arqueiro.getManaMaxima() + ", Força: " + arqueiro.getForca() + ", Defesa: " + arqueiro.getDefesa() + ", Flechas: " + arqueiro.getFlechas());
        System.out.println();

        // Batalha entre Guerreiro e Mago
        Arena.iniciarBatalha(guerreiro, mago);
    }
}