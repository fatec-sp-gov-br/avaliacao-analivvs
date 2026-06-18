package br.edu.poo;

public class Personagem {

    private String nome;
    private int vida;
    private int ataque;
    private int defesa;
    private boolean pocaoUtilizada;

    public Personagem(String nome, int vida, int ataque, int defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pocaoUtilizada = false;
    }

    public void atacar(Personagem inimigo) {
        int dano = ataque - inimigo.defesa;

        if (dano < 1) {
            dano = 1;
        }

        inimigo.receberDano(dano);
    }

    public void receberDano(int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }
    }

    public void usarPocao(Pocao pocao) {
        if (!pocaoUtilizada) {
            vida += pocao.getCura();
            pocaoUtilizada = true;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}
