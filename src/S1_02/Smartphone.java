package S1_02;

public class Smartphone extends Phone implements Camera, Clock{

    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void cameraShot() {
        System.out.println("Haciendo foto");
    }
    @Override
    public void ringAlarm() {
        System.out.println("Sonando la alarma");
    }
}
