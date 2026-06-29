import S1_01.Instrument;
import S1_01.PercussionInstrument;
import S1_01.StringInstrument;
import S1_01.WindInstrument;
import S1_01_2.Coche;
import S1_02.Smartphone;

void main() {

    // S1_01
    System.out.println(PercussionInstrument.cargaEstatica());
    PercussionInstrument bongo = new PercussionInstrument("bongó", 130.75);

    System.out.println(StringInstrument.cargaEstatica());
    StringInstrument viola = new StringInstrument("viola", 150.80);

    System.out.println(WindInstrument.cargaEstatica());
    WindInstrument flauta = new WindInstrument("Flauta", 80.50);

    bongo.play();
    viola.play();
    flauta.play();

    // S1_01_2
    Coche.brake();

    Coche cochito = new Coche ("born", 430);
    cochito.accelerate();

    //S1_02
    Smartphone iPhone = new Smartphone("Apple", "17Pro");

    iPhone.call();
    iPhone.cameraShot();
    iPhone.ringAlarm();





    }

