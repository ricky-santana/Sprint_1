package S1_03;

public class NoticiaF1 extends Noticia {
    private final String escuderia;
    private static final double precioBase = 100d;
    private double precioFinal;

    public NoticiaF1 (String titular, String texto, int puntuacion, double precio, String escuderia, double precioFinal) {
        super(titular, texto, puntuacion, precio);
        this.escuderia = escuderia;
        this.precioFinal = precioFinal;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    @Override
    public void calcularPrecio() {
        this.precioFinal = precioBase;
        if (this.escuderia.equalsIgnoreCase("Ferrari") ||
                this.escuderia.equalsIgnoreCase("Mercedes")){
            precioFinal += 50;
        }

    }

}
