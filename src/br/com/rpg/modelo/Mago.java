package br.com.rpg.modelo;

/**
 * Classe que representa um Mago, uma classe especializada em magia.
 */
public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 30, 5);
    }

    @Override
    public int atacar() {
        System.out.println(nome + " (Mago) lança uma bola de fogo!");
        return forca + 10; // Bônus de magia
    }

    public void usarMagiaCurativa() {
        System.out.println(nome + " usa magia curativa!");
        vida = Math.min(vida + 20, 100);
    }
}