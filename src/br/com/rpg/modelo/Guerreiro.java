package br.com.rpg.modelo;

/**
 * Classe que representa um Guerreiro, uma classe de combate corpo a corpo.
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 120, 25, 15);
    }

    @Override
    public int atacar() {
        System.out.println(nome + " (Guerreiro) ataca com sua espada!");
        return forca;
    }

    public void usarEscudo() {
        System.out.println(nome + " levanta o escudo e aumenta sua defesa!");
    }
}