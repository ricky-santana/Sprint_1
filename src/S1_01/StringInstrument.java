package S1_01;

public class StringInstrument extends Instrument {
    static {
        System.out.println("Clase cuerda cargada en memoria");
    }
    public static String cargaEstatica() {
        return " de forma estática, llamando al método y sin necesidad de instanciar la clase" + "\n_______\n";
    }

    public StringInstrument (String name, Double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda");
    }
}

