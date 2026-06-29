package S1_03;

public class NoticiaTenis extends Noticia {
    private final String tenistas;
    private static final double precioBase = 100d;
    private double precioFinal;

    public NoticiaTenis (String titular, String texto, int puntuacion, double precio, String competicion, String club) {
        super(titular, texto, puntuacion, precio);
        this.tenistas = club;
        this.precioFinal = 0d;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    @Override
    public void calcularPrecio() {
        this.precioFinal = precioBase;
        if (this.tenistas.equalsIgnoreCase("Federer") ||
                this.tenistas.equalsIgnoreCase("Nadal") ||
                this.tenistas.equalsIgnoreCase("Djokovic")){
            precioFinal += 100;
        }

    }

}


