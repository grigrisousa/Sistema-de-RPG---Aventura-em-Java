package br.com.rpg.modelo;

/**
 * Classe que representa um Arqueiro, uma classe de ataque à distância.
 */
public class Arqueiro extends Personagem {
    private int flechas;

    public Arqueiro(String nome) {
        super(nome, 100, 50, 28, 12);
        this.flechas = 30;
    }

    public int getFlechas() {
        return flechas;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (flechas > 0) {
            System.out.println(nome + " dispara uma flecha certeira!");
            flechas--;
            
            int dano = (int)(forca * 1.3);
            boolean derrotado = alvo.receberDano(dano);
            
            if (derrotado) {
                ganharExperiencia(50);
            }
        } else {
            System.out.println(nome + " não tem flechas suficientes!");
        }
    }

    @Override
    public void usarHabilidadeEspecial(Personagem alvo) {
        String nomeHabilidade = "Chuva de Flechas";
        int custoMana = 15;
        int custoFlechas = 5;
        
        if (temMana(custoMana) && flechas >= custoFlechas) {
            System.out.println("🏹 " + nome + " usa " + nomeHabilidade + "!");
            System.out.println("    Uma saraivada de flechas cai sobre o inimigo!");
            consumirMana(custoMana);
            flechas -= custoFlechas;
            
            // 3 ataques consecutivos
            for (int i = 1; i <= 3; i++) {
                if (alvo.estaVivo()) {
                    int dano = (int)(forca * 2.0);
                    System.out.println("    Flecha " + i + ": " + dano + " de dano!");
                    boolean derrotado = alvo.receberDano(dano);
                    
                    if (derrotado) {
                        ganharExperiencia(50);
                        break;
                    }
                }
            }
        } else {
            if (!temMana(custoMana)) {
                System.out.println(nome + " não tem mana suficiente para usar " + nomeHabilidade + "!");
            } else {
                System.out.println(nome + " não tem flechas suficientes para usar " + nomeHabilidade + "!");
            }
        }
    }

    /**
     * Método exclusivo do Arqueiro para recarregar flechas.
     */
    public void recarregarFlechas(int quantidade) {
        flechas += quantidade;
        System.out.println(nome + " recarregou " + quantidade + " flechas! Total: " + flechas);
    }

    @Override
    public String getTipo() {
        return "Arqueiro";
    }
}