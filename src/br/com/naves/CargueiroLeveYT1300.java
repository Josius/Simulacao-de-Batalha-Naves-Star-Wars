package br.com.naves;

import br.com.personagens.CoPiloto;
import br.com.personagens.Personagem;
import br.com.personagens.Piloto;
import br.com.personagens.personagem.Passageiro;
import br.com.personagens.personagem.TripulacaoGenerica;

import java.util.ArrayList;
import java.util.List;

public class CargueiroLeveYT1300 extends Espaconave {
    private Piloto pilotoAtual;
    private CoPiloto coPilotoAtual;
    private List<TripulacaoGenerica> tripulacaoAtual;


    public CargueiroLeveYT1300() {
        this.setBlindagem(50);
        this.setDanoDeCanhoesBlasters(9);
        this.setVelocidade(3);
        this.setEscudoDeEnergia(25);
        this.setDefesa(12);
        this.tripulacaoAtual = new ArrayList<>();
    }

    public void inserirPiloto(Piloto piloto) {

        this.pilotoAtual = piloto;
    }

    public void inserirCoPiloto(CoPiloto coPiloto) {

        this.coPilotoAtual = coPiloto;
    }

    public void inserirTripulacao(TripulacaoGenerica tripulacao){
        if(this.tripulacaoAtual.size() < 6){
            this.tripulacaoAtual.add(tripulacao);
        }else{
            System.out.println("Capacidade tripulacao cargueiro leve YT1300 lotada!");
        }
    }

    public void atualPiloto() {
        System.out.println(pilotoAtual);
    }

    public void atualCoPiloto() {
        System.out.println(coPilotoAtual);
    }

    public void atualTripulacao() {
        System.out.println(tripulacaoAtual);
    }

}
