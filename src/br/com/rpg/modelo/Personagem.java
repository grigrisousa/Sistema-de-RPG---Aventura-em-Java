package br.com.rpg.modelo;

/**
 * Classe abstrata que representa um personagem genérico no RPG.
 */
public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected int mana;
    protected int manaMaxima;
    protected int forca;
    protected int defesa;
    protected int experiencia;

    public Personagem(String nome, int vida, int mana, int forca, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.manaMaxima = mana;
        this.forca = forca;
        this.defesa = defesa;
        this.experiencia = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getMana() {
        return mana;
    }

    public int getManaMaxima() {
        return manaMaxima;
    }

    public int getForca() {
        return forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setMana(int mana) {
        this.mana = Math.max(0, Math.min(mana, manaMaxima));
    }

    /**
     * Ganha experiência e exibe mensagem.
     */
    public void ganharExperiencia(int xp) {
        this.experiencia += xp;
        System.out.println(nome + " ganhou " + xp + " de experiência! Total: " + experiencia);
    }

    /**
     * Método para receber dano. Retorna true se o personagem foi derrotado.
     */
    public boolean receberDano(int dano) {
        int danoReal = Math.max(0, dano - defesa);
        vida = Math.max(0, vida - danoReal);
        System.out.println(nome + " recebeu " + danoReal + " de dano! Vida restante: " + vida);
        
        if (vida <= 0) {
            System.out.println(nome + " foi derrotado!");
            return true;
        }
        return false;
    }

    /**
     * Verifica se tem mana suficiente.
     */
    public boolean temMana(int custo) {
        return mana >= custo;
    }

    /**
     * Consome mana.
     */
    public void consumirMana(int custo) {
        mana -= custo;
    }

    /**
     * Verifica se o personagem está vivo.
     */
    public boolean estaVivo() {
        return vida > 0;
    }

    /**
     * Retorna o tipo do personagem.
     */
    public abstract String getTipo();

    /**
     * Método abstrato para ataque.
     */
    public abstract void atacar(Personagem alvo);

    /**
     * Método abstrato para habilidade especial.
     */
    public abstract void usarHabilidadeEspecial(Personagem alvo);
}