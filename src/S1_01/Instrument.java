package S1_01;

public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, Double price) {
    }

    public abstract void play();
}
