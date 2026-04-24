package br.com.rpg.modelo;

/**
 * Classe que representa um Arqueiro, uma classe de ataque à distância.
 */
public class Arqueiro extends Personagem {

    public Arqueiro(String nome) {
        super(nome, 100, 22, 10);
    }

    @Override
    public int atacar() {
        System.out.println(nome + " (Arqueiro) dispara uma flecha precisa!");
        return forca + 5; // Bônus de precisão
    }

    public void usarTiroCritico() {
        System.out.println(nome + " prepara um tiro crítico!");
    }
}