package br.com.rpg.principal;

import br.com.rpg.modelo.Guerreiro;
import br.com.rpg.modelo.Mago;
import br.com.rpg.modelo.Arqueiro;
import br.com.rpg.modelo.Personagem;
import br.com.rpg.sistema.Arena;
import java.util.ArrayList;

public class JogoRPG {

    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     BEM-VINDO AO JOGO DE RPG!          ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        // ============================================
        // CRIAÇÃO DE PERSONAGENS
        // ============================================
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     1. CRIAÇÃO DE PERSONAGENS          ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        Guerreiro guerreiro = new Guerreiro("Arthur");
        Mago mago = new Mago("Merlin");
        Arqueiro arqueiro = new Arqueiro("Legolas");

        System.out.println("Personagens criados com sucesso!");
        System.out.println();
        System.out.println("- " + guerreiro.getNome() + " (" + guerreiro.getTipo() + ")");
        System.out.println("  Vida: " + guerreiro.getVida() + "/" + guerreiro.getVidaMaxima() + 
                          " | Mana: " + guerreiro.getMana() + "/" + guerreiro.getManaMaxima() + 
                          " | Ataque: " + guerreiro.getAtaque() + 
                          " | Defesa: " + guerreiro.getDefesa());
        System.out.println();
        System.out.println("- " + mago.getNome() + " (" + mago.getTipo() + ")");
        System.out.println("  Vida: " + mago.getVida() + "/" + mago.getVidaMaxima() + 
                          " | Mana: " + mago.getMana() + "/" + mago.getManaMaxima() + 
                          " | Ataque: " + mago.getAtaque() + 
                          " | Defesa: " + mago.getDefesa());
        System.out.println();
        System.out.println("- " + arqueiro.getNome() + " (" + arqueiro.getTipo() + ")");
        System.out.println("  Vida: " + arqueiro.getVida() + "/" + arqueiro.getVidaMaxima() + 
                          " | Mana: " + arqueiro.getMana() + "/" + arqueiro.getManaMaxima() + 
                          " | Ataque: " + arqueiro.getAtaque() + 
                          " | Defesa: " + arqueiro.getDefesa() + 
                          " | Flechas: " + arqueiro.getFlechas());
        System.out.println();

        // ============================================
        // DEMONSTRAÇÃO DE POLIMORFISMO
        // ============================================
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║  2. DEMONSTRAÇÃO DE POLIMORFISMO       ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        ArrayList<Personagem> personagens = new ArrayList<>();
        personagens.add(guerreiro);
        personagens.add(mago);
        personagens.add(arqueiro);

        System.out.println("Percorrendo array de Personagem (polimorfismo):");
        System.out.println();
        for (Personagem p : personagens) {
            p.exibirStatus();
            System.out.println();
        }

        // ============================================
        // TESTE DE HABILIDADES
        // ============================================
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     3. TESTE DE HABILIDADES            ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        // Criar alvo para teste de habilidades
        Guerreiro alvoTeste = new Guerreiro("Goblin");
        
        System.out.println("Alvo: " + alvoTeste.getNome() + " (" + alvoTeste.getTipo() + ")");
        System.out.println("Vida: " + alvoTeste.getVida() + "/" + alvoTeste.getVidaMaxima());
        System.out.println();

        // Habilidade do Guerreiro
        System.out.println("--- Habilidade do Guerreiro ---");
        guerreiro.usarHabilidadeEspecial(alvoTeste);
        System.out.println();

        // Habilidade do Mago
        System.out.println("--- Habilidade do Mago ---");
        alvoTeste.curar(100); // Curar para testar novamente
        mago.usarHabilidadeEspecial(alvoTeste);
        System.out.println();

        // Habilidade do Arqueiro
        System.out.println("--- Habilidade do Arqueiro ---");
        alvoTeste.curar(100); // Curar para testar novamente
        arqueiro.usarHabilidadeEspecial(alvoTeste);
        System.out.println();

        // Métodos exclusivos
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   4. MÉTODOS EXCLUSIVOS POR CLASSE     ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        // Mago regenera mana
        System.out.println("--- Mago: regenerarMana() ---");
        System.out.println("Mana atual: " + mago.getMana() + "/" + mago.getManaMaxima());
        mago.regenerarMana(30);
        System.out.println();

        // Arqueiro recarrega flechas
        System.out.println("--- Arqueiro: recarregarFlechas() ---");
        System.out.println("Flechas atuais: " + arqueiro.getFlechas());
        arqueiro.recarregarFlechas(20);
        System.out.println();

        // ============================================
        // SISTEMA DE EXPERIÊNCIA
        // ============================================
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║  5. SISTEMA DE EXPERIÊNCIA E LEVEL UP  ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        System.out.println("Personagens ganando experiência...");
        System.out.println();

        // Guerreiro ganha experiência
        System.out.println("--- " + guerreiro.getNome() + " ganha experiência ---");
        guerreiro.ganharExperiencia(60);
        System.out.println();

        // Mago ganha experiência
        System.out.println("--- " + mago.getNome() + " ganha experiência ---");
        mago.ganharExperiencia(80);
        System.out.println();

        // Arqueiro ganha experiência
        System.out.println("--- " + arqueiro.getNome() + " ganha experiência ---");
        arqueiro.ganharExperiencia(120); // Deve subir 2 níveis
        System.out.println();

        // ============================================
        // BATALHA INDIVIDUAL
        // ============================================
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║        6. BATALHA INDIVIDUAL           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        // Criar novos personagens para batalha
        Guerreiro guerreiro2 = new Guerreiro("Thorin");
        Mago mago2 = new Mago("Gandalf");

        System.out.println("Combatentes:");
        System.out.println("- " + guerreiro2.getNome() + " (" + guerreiro2.getTipo() + ") - " +
                          guerreiro2.getVida() + "/" + guerreiro2.getVidaMaxima() + " HP");
        System.out.println("- " + mago2.getNome() + " (" + mago2.getTipo() + ") - " +
                          mago2.getVida() + "/" + mago2.getVidaMaxima() + " HP");
        System.out.println();

        Arena.batalhar(guerreiro2, mago2);
        System.out.println();

        // ============================================
        // TORNEIO FINAL
        // ============================================
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           7. TORNEIO FINAL             ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();

        // Criar 4 personagens para o torneo
        Guerreiro guerreiro3 = new Guerreiro("Conan");
        Mago mago3 = new Mago("Saruman");
        Arqueiro arqueiro3 = new Arqueiro("Robin");
        Arqueiro arqueiro4 = new Arqueiro("Artemis");

        ArrayList<Personagem> participantesTorneio = new ArrayList<>();
        participantesTorneio.add(guerreiro3);
        participantesTorneio.add(mago3);
        participantesTorneio.add(arqueiro3);
        participantesTorneio.add(arqueiro4);

        System.out.println("Participantes do Torneio:");
        for (Personagem p : participantesTorneio) {
            System.out.println("- " + p.getNome() + " (" + p.getTipo() + ") - " +
                              p.getVida() + "/" + p.getVidaMaxima() + " HP");
        }
        System.out.println();

        Arena.torneo(participantesTorneio);
        System.out.println();

        // ============================================
        // FIM DO JOGO
        // ============================================
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     OBRIGADO POR JOGAR NOSSO RPG!      ║");
        System.out.println("╚════════════════════════════════════════╝");
    }
}