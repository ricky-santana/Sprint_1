import S1_01.Instrument;
import S1_01.PercussionInstrument;
import S1_01.StringInstrument;
import S1_01.WindInstrument;
import S1_01_2.Coche;
import S1_02.Smartphone;
import S1_03.Redactor;

static ArrayList<Redactor> redactores = new ArrayList<Redactor>(); // Lo necesito para el ej 3
static Scanner entrada = new Scanner(System.in);

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

    //S1_03
    byte menu = 0;

    while (menu != 8) {
        System.out.println("Qué desea hacer?\n"
                + "1. Introducir redactor\n"
                + "2. Eliminar redactor\n"
                + "3. Introducir noticia a un redactor\n"
                + "4. Eliminar noticia\n"
                + "5. Mostrar todas las noticias de un redactor\n"
                + "6. Calcular puntuacion de una noticia\n"
                + "7. Calcular precio de una noticia\n"
                + "8. salir.\n");
        menu = entrada.nextByte();

        switch (menu){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;

        }






    }

