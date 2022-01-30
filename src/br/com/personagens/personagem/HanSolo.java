package br.com.personagens.personagem;

import br.com.naves.CacaEstelarTIE;
import br.com.naves.CargueiroLeveYT1300;
import br.com.naves.Espaconave;
import br.com.personagens.Piloto;

public class HanSolo extends Piloto {
    private Espaconave espaconaveAtual;

    public void entrarNaEspaconave(CargueiroLeveYT1300 milleniumFalcon){
        this.espaconaveAtual = milleniumFalcon;
        milleniumFalcon.inserirPiloto(this);
    }
    //TODO funcoes especificas
}
