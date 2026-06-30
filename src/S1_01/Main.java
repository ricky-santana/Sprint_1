package S1_01;

public class Main {
    void main(){
        System.out.println(PercussionInstrument.cargaEstatica());
        PercussionInstrument bongo = new PercussionInstrument("bongó", 130.75);

        System.out.println(StringInstrument.cargaEstatica());
        StringInstrument viola = new StringInstrument("viola", 150.80);

        System.out.println(WindInstrument.cargaEstatica());
        WindInstrument flauta = new WindInstrument("Flauta", 80.50);

        bongo.play();
        viola.play();
        flauta.play();
    }
}
