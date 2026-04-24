package br.com.rpg.modelo;

/**
 * Classe que representa um Guerreiro, uma classe de combate corpo a corpo.
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 30, 25, 20);
    }

    @Override
    public void atacar(Personagem alvo) {
        System.out.println(nome + " desfere um golpe poderoso!");
        int dano = (int)(forca * 1.2);
        boolean derrotado = alvo.receberDano(dano);
        
        if (derrotado) {
            ganharExperiencia(50);
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        String nomeHabilidade = "Investida Furiosa";
        int custoMana = 20;
        
        if (temMana(custoMana)) {
            System.out.println("⚔️ " + nome + " usa " + nomeHabilidade + "!");
            System.out.println("    Um golpe devastador que atravessa a defesa do inimigo!");
            consumirMana(custoMana);
            
            int dano = (int)(forca * 2.5);
            boolean derrotado = alvo.receberDano(dano);
            
            if (derrotado) {
                ganharExperiencia(50);
            }
        } else {
            System.out.println(nome + " não tem mana suficiente para usar " + nomeHabilidade + "!");
        }
    }

    @Override
    public String getTipo() {
        return "Guerreiro";
    }
}