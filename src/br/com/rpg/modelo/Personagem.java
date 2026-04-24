package br.com.rpg.modelo;

/**
 * Classe abstrata que representa um personagem genérico no RPG.
 */
public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int forca;
    protected int defesa;

    public Personagem(String nome, int vida, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Método abstrato para ataque específico de cada classe.
     */
    public abstract int atacar();

    /**
     * Método para receber dano.
     */
    public void receberDano(int dano) {
        int danoReal = Math.max(0, dano - defesa);
        vida = Math.max(0, vida - danoReal);
        System.out.println(nome + " recebeu " + danoReal + " de dano! Vida restante: " + vida);
    }

    /**
     * Verifica se o personagem está vivo.
     */
    public boolean estaVivo() {
        return vida > 0;
    }
}