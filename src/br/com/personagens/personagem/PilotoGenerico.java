package br.com.personagens.personagem;

import br.com.naves.CorvetaCR90;
import br.com.naves.Espaconave;
import br.com.personagens.Piloto;

public class PilotoGenerico extends Piloto {
    private Espaconave espaconaveAtual;

    public void entrarNaEspaconave(CorvetaCR90 cr90){
        this.espaconaveAtual = cr90;
        cr90.inserirPiloto(this);
    }
    //TODO funcoes especificas
}
