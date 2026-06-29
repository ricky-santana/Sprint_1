package S1_03;

public class NoticiaMoto extends Noticia {
    private final String equipo;
    private static final double precioBase = 100d;
    private double precioFinal;

    public NoticiaMoto(String titular, String texto, int puntuacion, double precio, String equipo, double precioFinal) {
        super(titular, texto, puntuacion, precio);
        this.equipo = equipo;
        this.precioFinal = precioFinal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    @Override
    public void calcularPrecio() {
        this.precioFinal = precioBase;
        if (this.equipo.equalsIgnoreCase("Honda") ||
                this.equipo.equalsIgnoreCase("Yamaha")) {
            precioFinal += 50;
        }

    }

}