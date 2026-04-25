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
        this.nivel = 1;
        this.vida = vida;
        this.vidaMaxima = vida;
        this.mana = mana;
        this.manaMaxima = mana;
<<<<<<< HEAD
        this.ataque();
=======
        this.ataque = ataque;
>>>>>>> 85c8f04 (finalização com ajustes nas classes)
        this.defesa = defesa;
        this.experiencia = 0;
    }

    private void ataque() {
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getMana() {
        return mana;
    }

    public int getManaMaxima() {
        return manaMaxima;
    }

<<<<<<< HEAD
    public int getForca() {
=======
    public int getAtaque() {
>>>>>>> 85c8f04 (finalização com ajustes nas classes)
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

<<<<<<< HEAD
    public void ganharExperiencia(int xp) {
        this.experiencia += xp;
        System.out.println(nome + " ganhou " + xp + " de experiência! Total: " + experiencia);
=======
    public void exibirStatus() {
        System.out.println("=== " + nome + " ===");
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida + "/" + vidaMaxima);
        System.out.println("Mana: " + mana + "/" + manaMaxima);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("Experiência: " + experiencia + "/100");
        System.out.println("Tipo: " + getTipo());
>>>>>>> 85c8f04 (finalização com ajustes nas classes)
    }

    public boolean receberDano(int dano) {
        int danoReal = dano - (defesa / 2);
        if (danoReal < 0) {
            danoReal = 0;
        }
        vida = Math.max(0, vida - danoReal);
        System.out.println(nome + " recebeu " + danoReal + " de dano! Vida: " + vida + "/" + vidaMaxima);
        
        if (vida <= 0) {
            return true;
        }
        return false;
    }

<<<<<<< HEAD
    public boolean temMana(int custo) {
        return mana >= custo;
    }

    public void consumirMana(int custo) {
        mana -= custo;
=======
    public void curar(int quantidade) {
        vida = Math.min(vida + quantidade, vidaMaxima);
        System.out.println(nome + " curou " + quantidade + " de vida! Vida: " + vida + "/" + vidaMaxima);
    }

    public void ganharExperiencia(int exp) {
        experiencia += exp;
        System.out.println(nome + " ganhou " + exp + " de experiência! Total: " + experiencia);
        
        if (experiencia >= 100) {
            subirNivel();
        }
    }

    public void subirNivel() {
        nivel++;
        vidaMaxima += 20;
        manaMaxima += 10;
        ataque += 5;
        defesa += 3;
        vida = vidaMaxima;
        mana = manaMaxima;
        experiencia = 0;
        System.out.println(">>> " + nome + " SUBIU DE NÍVEL! <<<");
        System.out.println("    Novo nível: " + nivel);
        System.out.println("    Vida: " + vida + " | Mana: " + mana);
        System.out.println("    Ataque: " + ataque + " | Defesa: " + defesa);
>>>>>>> 85c8f04 (finalização com ajustes nas classes)
    }

    public boolean estaVivo() {
        return vida > 0;
    }

<<<<<<< HEAD
=======
    public boolean temMana(int custo) {
        return mana >= custo;
    }

    public void consumirMana(int custo) {
        mana -= custo;
    }

>>>>>>> 85c8f04 (finalização com ajustes nas classes)
    public abstract String getTipo();

    public abstract void atacar(Personagem alvo);

    public abstract void usarHabilidadeEspecial(Personagem alvo);
}