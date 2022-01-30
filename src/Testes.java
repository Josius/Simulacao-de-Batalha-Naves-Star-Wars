import br.com.naves.CacaEstelarTIE;
import br.com.naves.CargueiroLeveYT1300;
import br.com.naves.CorvetaCR90;
import br.com.naves.Espaconave;
import br.com.personagens.Personagem;
import br.com.personagens.personagem.*;

import java.util.ArrayList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        Espaconave cacaTie = new CacaEstelarTIE();
        Espaconave milleniumFalcon = new CargueiroLeveYT1300();
        Espaconave cr90 = new CorvetaCR90();

        Personagem hanSolo = new HanSolo();
        Personagem chewee = new Chewbacca();
        Personagem pilotoImperio = new PilotoDoImperio();
        Personagem pilotoGenerico = new PilotoGenerico();
        Personagem coPilotoGenerico = new CoPilotoGenerico();

        List<TripulacaoGenerica> tripulacao = new ArrayList<>();
        List<Passageiro> passageiros = new ArrayList<>();

        for(int i =0; i <=10; i++){
            tripulacao.add(new TripulacaoGenerica());
        }
        for(int i =0; i <=10; i++){
            passageiros.add(new Passageiro());
        }

        //Inserindo pilotos, copilotos, tripulacao e passageiros
        ((HanSolo) hanSolo).entrarNaEspaconave((CargueiroLeveYT1300) milleniumFalcon);
        ((Chewbacca) chewee).entrarNaEspaconave((CargueiroLeveYT1300) milleniumFalcon);
        for(int i =0; i <=10; i++){
            ((CargueiroLeveYT1300) milleniumFalcon).inserirTripulacao(tripulacao.get(i));
        }

        System.out.println("Tripulacao da Millenium Falcon");
        ((CargueiroLeveYT1300) milleniumFalcon).atualPiloto();
        ((CargueiroLeveYT1300) milleniumFalcon).atualCoPiloto();
        ((CargueiroLeveYT1300) milleniumFalcon).atualTripulacao();

        System.out.println("Tripulacao do Caca Tie");
        ((PilotoDoImperio) pilotoImperio).entrarNaEspaconave((CacaEstelarTIE) cacaTie);
        ((CacaEstelarTIE) cacaTie).atualPiloto();

        System.out.println("Tripulacao da Corveta CR90");
        ((PilotoGenerico) pilotoGenerico).entrarNaEspaconave((CorvetaCR90) cr90);
        ((CoPilotoGenerico) coPilotoGenerico).entrarNaEspaconave((CorvetaCR90) cr90);
        for(int i =6; i <=10; i++){
            ((CorvetaCR90) cr90).inserirTripulacao(tripulacao.get(i));
        }
        for(int i =0; i <=10; i++){
            ((CorvetaCR90) cr90).inserirPassageiros(passageiros.get(i));
        }
        ((CorvetaCR90) cr90).atualPiloto();
        ((CorvetaCR90) cr90).atualCoPiloto();
        ((CorvetaCR90) cr90).atualTripulacao();
        ((CorvetaCR90) cr90).atualPassageiros();


        //Combate Simples
        System.out.println("Caca Tie");
        System.out.println("blindagem " + cacaTie.getBlindagem());
        System.out.println("escuco de energia" + cacaTie.getEscudoDeEnergia());
        System.out.println("Millenium Falcon");
        System.out.println("blindagem " + milleniumFalcon.getBlindagem());
        System.out.println("escuco de energia" + milleniumFalcon.getEscudoDeEnergia());
        System.out.println("Corveta cr90");
        System.out.println("blindagem " + cr90.getBlindagem());
        System.out.println("escuco de energia" + cr90.getEscudoDeEnergia());

        milleniumFalcon.atacar(cacaTie);

        cr90.atacar(cacaTie);
        cr90.atacar(milleniumFalcon);
        milleniumFalcon.atacar(cr90);
        milleniumFalcon.atacar(cr90);
        milleniumFalcon.atacar(cr90);

        System.out.println("Caca Tie");
        System.out.println("blindagem " + cacaTie.getBlindagem());
        System.out.println("escuco de energia" + cacaTie.getEscudoDeEnergia());
        System.out.println("Millenium Falcon");
        System.out.println("blindagem " + milleniumFalcon.getBlindagem());
        System.out.println("escuco de energia" + milleniumFalcon.getEscudoDeEnergia());
        System.out.println("Corveta cr90");
        System.out.println("blindagem " + cr90.getBlindagem());
        System.out.println("escuco de energia" + cr90.getEscudoDeEnergia());
    }
}
