package S1_03;

public class NoticiaTenis extends Noticia {
    private final String tenistas;
    private static final double PRECIO_BASE = 100d;
    private double precioFinal;
    private static final int PUNTUACION_BASE = 4;
    private int puntuacionFinal;

    public NoticiaTenis (String titular, String texto, int puntuacion, double precio, String tenistas) {
        super(titular, texto, puntuacion, precio);
        this.tenistas = tenistas;
        this.precioFinal = 0d;
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
        this.precioFinal = PRECIO_BASE;
        if (this.tenistas.equalsIgnoreCase("Federer") ||
                this.tenistas.equalsIgnoreCase("Nadal") ||
                this.tenistas.equalsIgnoreCase("Djokovic")){
            precioFinal += 100;
        }

    }
    @Override
    public void calcularPuntuacion() {
        this.puntuacionFinal = PUNTUACION_BASE;
        if (this.tenistas.equalsIgnoreCase("Federer") ||
                this.tenistas.equalsIgnoreCase("Nadal") ||
                this.tenistas.equalsIgnoreCase("Djokovic")){
            precioFinal += 3;
        }

    }

}


