package br.edu.poo;

public class Jogo {

    public static void main(String[] args) {

        Personagem artemis = new Personagem("Artemis", 30, 8, 2);
        Personagem goblin = new Personagem("Goblin", 20, 5, 1);

        Pocao pequena = new Pocao("Poção Pequena", 10);

        System.out.println("=== BATALHA INICIADA ===");

        while (artemis.estaVivo() && goblin.estaVivo()) {

            artemis.atacar(goblin);
            System.out.println(goblin.getNome() + " possui " + goblin.getVida() + " de vida");

            if (!goblin.estaVivo()) {
                break;
            }

            if (goblin.getVida() <= 10) {
                goblin.usarPocao(pequena);
                System.out.println(goblin.getNome() + " usa " + pequena.getNome());
                System.out.println(goblin.getNome() + " possui " + goblin.getVida() + " de vida");
            }

            goblin.atacar(artemis);
            System.out.println(artemis.getNome() + " possui " + artemis.getVida() + " de vida");
        }

        System.out.println("=== FIM DA BATALHA ===");

        if (artemis.estaVivo()) {
            System.out.println("Vencedor: " + artemis.getNome());
        } else {
            System.out.println("Vencedor: " + goblin.getNome());
        }
    }
}
