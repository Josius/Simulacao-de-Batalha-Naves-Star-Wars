package br.com.personagens.personagem;

import br.com.naves.CorvetaCR90;
import br.com.naves.Espaconave;
import br.com.personagens.CoPiloto;

public class CoPilotoGenerico extends CoPiloto {
    private Espaconave espaconaveAtual;

    public void entrarNaEspaconave(CorvetaCR90 cr90){
        this.espaconaveAtual = cr90;
        cr90.inserirCoPiloto(this);
    }
    //TODO funcoes especificas
}
