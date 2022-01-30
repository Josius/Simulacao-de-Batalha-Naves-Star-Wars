package br.com.naves;

import br.com.personagens.Personagem;

import java.util.List;
import java.util.Set;

public class CacaEstelarTIE extends Espaconave {
    private Personagem pilotoAtual;

    public CacaEstelarTIE() {
        this.setBlindagem(20);
        this.setDanoDeCanhoesBlasters(5);
        this.setVelocidade(5);
        this.setEscudoDeEnergia(0);
        defesaTIE();
    }

    public void defesaTIE() {
        this.setDefesa(3 * this.getVelocidade());
    }

    public void inserirPiloto(Personagem piloto) {
        this.pilotoAtual = piloto;
    }

    public void atualPiloto() {
        System.out.println(pilotoAtual);
    }

}
