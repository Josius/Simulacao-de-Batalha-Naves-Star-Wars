package br.com.naves;

import br.com.personagens.Personagem;

import java.util.List;
import java.util.Random;

public abstract class Espaconave {

    private int blindagem;              //PVs
    private int danoDeCanhoesBlasters;  //Dano
    private int escudoDeEnergia;        //RD
    private int defesa;
    private int velocidade;             //aumentar CA
    private Random random;


    //logica de ataque e dano
    public void atacar(Espaconave alvo) {
        random = new Random();
        int valorAtaque = random.nextInt(20)+1;

        if (valorAtaque >= alvo.getDefesa()) {
            disparar(alvo);
        }
    }

    //precisa melhorar para o dano que quando o escudo cair o dano restante subtraia da blindagem
    public void disparar(Espaconave alvo) {
        if (alvo.getEscudoDeEnergia() > 0) {
            alvo.danoAoEscudo(danoDeCanhoesBlasters);
        } else
            alvo.danoBlindagem(danoDeCanhoesBlasters);
    }

    public void danoAoEscudo(int danoDeCanhoesBlasters) {
        this.escudoDeEnergia -= danoDeCanhoesBlasters;
    }

    public void danoBlindagem(int danoDeCanhoesBlasters) {
        this.blindagem -= danoDeCanhoesBlasters;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getBlindagem() {
        return blindagem;
    }

    public void setBlindagem(int blindagem) {
        this.blindagem = blindagem;
    }

    public int getDanoDeCanhoesBlasters() {
        return danoDeCanhoesBlasters;
    }

    public void setDanoDeCanhoesBlasters(int danoDeCanhoesBlasters) {
        this.danoDeCanhoesBlasters = danoDeCanhoesBlasters;
    }

    public int getEscudoDeEnergia() {
        return escudoDeEnergia;
    }

    public void setEscudoDeEnergia(int escudoDeEnergia) {
        this.escudoDeEnergia = escudoDeEnergia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public Random getRandom() {
        return new Random();
    }


}