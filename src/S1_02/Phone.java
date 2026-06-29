package S1_02;

public abstract class Phone {
    private String brand;
    private String model;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void call (){
        System.out.println("realizando llamada");
    }
}
