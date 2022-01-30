package br.com.personagens.personagem;

import br.com.naves.CargueiroLeveYT1300;
import br.com.naves.Espaconave;
import br.com.personagens.CoPiloto;

public class Chewbacca extends CoPiloto {
    private Espaconave espaconaveAtual;

    public void entrarNaEspaconave(CargueiroLeveYT1300 milleniumFalcon){
        this.espaconaveAtual = milleniumFalcon;
        milleniumFalcon.inserirCoPiloto(this);
    }
    //TODO funcoes especificas
}
