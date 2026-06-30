package S1_01_2;

public class Coche {
    static {
        System.out.println("Objeto coche instanciado");
    }

    private static final String BRAND = "Cupra";
    private static String model;
    private final int power;

    public Coche(String model, int power){
        Coche.model = model;
        this.power = power;
    }

    public static void brake (){
        System.out.println("Frenando");
    }
    public void accelerate (){
        System.out.println("Acelerando");
    }

}
