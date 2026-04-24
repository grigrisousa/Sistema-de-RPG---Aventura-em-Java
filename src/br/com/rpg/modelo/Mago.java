package br.com.rpg.modelo;

/**
 * Classe que representa um Mago, uma classe especializada em magia.
 */
public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 120, 30, 8);
    }

    @Override
    public void atacar(Personagem alvo) {
        int custoMana = 10;
        
        if (temMana(custoMana)) {
            System.out.println(nome + " lança uma bola de fogo!");
            consumirMana(custoMana);
            
            int dano = (int)(forca * 1.5);
            boolean derrotado = alvo.receberDano(dano);
            
            if (derrotado) {
                ganharExperiencia(50);
            }
        } else {
            System.out.println(nome + " não tem mana suficiente para atacar!");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        String nomeHabilidade = "Meteoro Arcano";
        int custoMana = 40;
        
        if (temMana(custoMana)) {
            System.out.println("🔥 " + nome + " usa " + nomeHabilidade + "!");
            System.out.println("    Um meteoro incandescente cai do céu em direção ao inimigo!");
            consumirMana(custoMana);
            
            int dano = (int)(forca * 3.0);
            boolean derrotado = alvo.receberDano(dano);
            
            if (derrotado) {
                ganharExperiencia(50);
            }
        } else {
            System.out.println(nome + " não tem mana suficiente para usar " + nomeHabilidade + "!");
        }
    }

    /**
     * Método exclusivo do Mago para regenerar mana.
     */
    public void regenerarMana(int quantidade) {
        mana = Math.min(mana + quantidade, manaMaxima);
        System.out.println(nome + " regenerou mana! Mana atual: " + mana + "/" + manaMaxima);
    }

    @Override
    public String getTipo() {
        return "Mago";
    }
}