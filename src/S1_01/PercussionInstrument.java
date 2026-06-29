package S1_01;

public class PercussionInstrument extends Instrument{
    static {
        System.out.println("Clase percusión cargada en memoria");
    }
    public static String cargaEstatica() {
        return " de forma estática, llamando al método y sin necesidad de instanciar la clase" + "\n_______\n";
    }

    public PercussionInstrument (String name, Double price){
        super (name, price);
    }



    @Override
    public void play() {
            System.out.println("Està sonant un instrument de percussió");
        }

    }

