package br.com.rpg.sistema;

import br.com.rpg.modelo.Personagem;
import java.util.ArrayList;

public class Arena {

    public static void batalhar(Personagem p1, Personagem p2) {
        System.out.println("========================================");
        System.out.println("     BATALHA: " + p1.getNome() + " VS " + p2.getNome());
        System.out.println("========================================");
        System.out.println();

        while (p1.estaVivo() && p2.estaVivo()) {
            p1.atacar(p2);

            if (!p2.estaVivo()) {
                System.out.println();
                System.out.println(p2.getNome() + " foi derrotado!");
                System.out.println(p1.getNome() + " VENCEU A BATALHA!");
                break;
            }

            p2.atacar(p1);

            if (!p1.estaVivo()) {
                System.out.println();
                System.out.println(p1.getNome() + " foi derrotado!");
                System.out.println(p2.getNome() + " VENCEU A BATALHA!");
                break;
            }

            System.out.println();
            exibirStatus(p1, p2);
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("           BATALHA ENCERRADA");
        System.out.println("========================================");
    }

    public static void exibirStatus(Personagem p1, Personagem p2) {
        System.out.println("--- STATUS ---");
        System.out.println(p1.getNome() + ": " + p1.getVida() + "/" + p1.getVidaMaxima() + " HP | " + p1.getMana() + "/" + p1.getManaMaxima() + " Mana");
        System.out.println(p2.getNome() + ": " + p2.getVida() + "/" + p2.getVidaMaxima() + " HP | " + p2.getMana() + "/" + p2.getManaMaxima() + " Mana");
    }

    public static void torneo(ArrayList<Personagem> participantes) {
        if (participantes.size() < 2) {
            System.out.println("Erro: O torneo precisa de pelo menos 2 participantes!");
            return;
        }

        System.out.println("========================================");
        System.out.println("           TORNEIO INICIADO");
        System.out.println("========================================");
        System.out.println("Participantes: " + participantes.size());
        System.out.println();

        while (participantes.size() > 1) {
            Personagem p1 = participantes.get(0);
            Personagem p2 = participantes.get(1);

            System.out.println(">>> Batalha: " + p1.getNome() + " VS " + p2.getNome());
            System.out.println();

            batalhar(p1, p2);

            Personagem vencedor;
            Personagem perdedor;

            if (p1.estaVivo()) {
                vencedor = p1;
                perdedor = p2;
            } else {
                vencedor = p2;
                perdedor = p1;
            }

            System.out.println();
            System.out.println(vencedor.getNome() + " avança para a próxima rodada!");
            System.out.println();

            participantes.remove(perdedor);

            vencedor.setVida(vencedor.getVidaMaxima());
            System.out.println(vencedor.getNome() + " foi curado completamente!");
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("           CAMPEÃO DO TORNEIO");
        System.out.println("========================================");
        System.out.println(">>> " + participantes.get(0).getNome() + " <<<");
        System.out.println("    Classe: " + participantes.get(0).getTipo());
        System.out.println("    HP: " + participantes.get(0).getVida() + "/" + participantes.get(0).getVidaMaxima());
        System.out.println("    Nível: " + participantes.get(0).getNivel());
        System.out.println("    Experiência: " + participantes.get(0).getExperiencia() + "/100");
        System.out.println("========================================");
    }
}