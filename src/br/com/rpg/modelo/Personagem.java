package br.com.rpg.modelo;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int vida;
    protected int vidaMaxima;
    protected int mana;
    protected int manaMaxima;
    protected int ataque;
    protected int defesa;
    protected int experiencia;

    public Personagem(String nome, int vida, int mana, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.manaMaxima = mana;
        this.ataque();
        this.defesa = defesa;
        this.experiencia = 0;
    }

    private void ataque() {
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
        return ataque;
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

    public void ganharExperiencia(int xp) {
        this.experiencia += xp;
        System.out.println(nome + " ganhou " + xp + " de experiência! Total: " + experiencia);
    }

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

    public boolean temMana(int custo) {
        return mana >= custo;
    }

    public void consumirMana(int custo) {
        mana -= custo;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public abstract String getTipo();

    public abstract void atacar(Personagem alvo);

    public abstract void usarHabilidadeEspecial(Personagem alvo);
}