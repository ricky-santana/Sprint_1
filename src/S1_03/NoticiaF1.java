package S1_03;

public class NoticiaF1 extends Noticia {
    private final String escuderia;
    private static final double PRECIO_BASE = 100d;
    private double precioFinal;
    private static final int PUNTUACION_BASE = 4;
    private int puntuacionFinal;

    public NoticiaF1 (String titular, String texto, int puntuacion, double precio, String escuderia) {
        super(titular, texto, puntuacion, precio);
        this.escuderia = escuderia;
        this.precioFinal = precioFinal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    public double getPuntuacionFinal() {
        return precioFinal;
    }

    @Override
    public void calcularPrecio() {
        this.precioFinal = PRECIO_BASE;
        if (this.escuderia.equalsIgnoreCase("Ferrari") ||
                this.escuderia.equalsIgnoreCase("Mercedes")){
            precioFinal += 50;
        }
    }
    @Override
    public void calcularPuntuacion() {
        this.puntuacionFinal = PUNTUACION_BASE;
        if (this.escuderia.equalsIgnoreCase("Ferrari") ||
                this.escuderia.equalsIgnoreCase("Mercedes")){
            puntuacionFinal += 2;
        }
    }

}
