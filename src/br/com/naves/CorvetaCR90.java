package br.com.naves;

import br.com.personagens.CoPiloto;
import br.com.personagens.Personagem;
import br.com.personagens.Piloto;
import br.com.personagens.personagem.Passageiro;
import br.com.personagens.personagem.TripulacaoGenerica;

import java.util.ArrayList;
import java.util.List;

public class CorvetaCR90 extends Espaconave {
    private Piloto pilotoAtual;
    private CoPiloto coPilotoAtual;
    private List<TripulacaoGenerica> tripulacaoAtual;
    private List<Passageiro> passageiros;

    public CorvetaCR90() {
        this.setBlindagem(100);
        this.setDanoDeCanhoesBlasters(20);
        this.setVelocidade(3);
        this.setEscudoDeEnergia(100);
        this.setDefesa(10);
        this.tripulacaoAtual = new ArrayList<>();
        this.passageiros = new ArrayList<>();
    }


    public void atacar(Espaconave alvo) {
        int valorAtaque;
        for (int i = 0; i < 3; i++) {

            valorAtaque = super.getRandom().nextInt(20) + 1;

            if (valorAtaque >= alvo.getDefesa()) {
                disparar(alvo);
            }
        }
    }

    public void inserirPiloto(Piloto piloto) {

        this.pilotoAtual = piloto;
    }

    public void inserirCoPiloto(CoPiloto coPiloto) {

        this.coPilotoAtual = coPiloto;
    }

    public void inserirTripulacao(TripulacaoGenerica tripulacao){
        if(this.tripulacaoAtual.size() < 165){
            this.tripulacaoAtual.add(tripulacao);
        }else{
            System.out.println("Capacidade tripulacao CR90 lotada!");
        }
    }

    public void inserirPassageiros(Passageiro passageiro){
        if(this.passageiros.size() < 600){
            this.passageiros.add(passageiro);
        }else{
            System.out.println("Capacidade passageiros CR90 lotada!");
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

    public void atualPassageiros() {
        System.out.println(passageiros);
    }
}
