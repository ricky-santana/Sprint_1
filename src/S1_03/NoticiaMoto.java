package S1_03;

public class NoticiaMoto extends Noticia {
    private final String equipo;
    private static final double precioBase = 100d;
    private double precioFinal;
    private static final int puntuacionBase = 3;
    private int puntuacionFinal;

    public NoticiaMoto(String titular, String texto, int puntuacion, double precio, String equipo) {
        super(titular, texto, puntuacion, precio);
        this.equipo = equipo;
        this.precioFinal = precioFinal;
        this.puntuacionFinal = 0;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    public double getPuntuacionFinal() {
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
    @Override
    public void calcularPuntuacion() {
        this.precioFinal = precioBase;
        if (this.equipo.equalsIgnoreCase("Honda") ||
                this.equipo.equalsIgnoreCase("Yamaha")) {
            precioFinal += 3;
        }

    }

}