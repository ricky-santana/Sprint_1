package S1_01;

public class WindInstrument extends Instrument{
    static {
        System.out.println("Clase viento cargada en memoria");
    }
    public static String cargaEstatica() {
        return " de forma estática, llamando al método y sin necesidad de instanciar la clase" + "\n_______\n";
    }

    public WindInstrument (String name, Double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent");
    }
}
