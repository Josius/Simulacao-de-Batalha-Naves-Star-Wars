package br.com.personagens.personagem;

import br.com.naves.CacaEstelarTIE;
import br.com.naves.Espaconave;
import br.com.personagens.Piloto;

public class PilotoDoImperio extends Piloto {
    private Espaconave espaconaveAtual;

    public void entrarNaEspaconave(CacaEstelarTIE tie){
        this.espaconaveAtual = tie;
        tie.inserirPiloto(this);
    }
    //TODO funcoes especificas

}
