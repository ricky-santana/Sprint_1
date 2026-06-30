package S1_03;

public class NoticiaBaloncesto extends Noticia{
    private final String competicion;
    private final String club;
    private static final double PRECIO_BASE = 250d;
    private double precioFinal;
    private static final int PUNTUACION_BASE = 4;
    private int puntuacionFinal;

    public NoticiaBaloncesto(String titular, String texto, int puntuacion, double precio, String competicion, String club) {
        super(titular, texto, puntuacion, precio);
        this.competicion = competicion;
        this.club = club;
        this.precioFinal = 0d;
        this.puntuacionFinal = 0;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    public double getPuntuacionFinal() {
        return puntuacionFinal;
    }


    @Override
    public void calcularPrecio() {
        this.precioFinal = PRECIO_BASE;
        if (this.competicion.equalsIgnoreCase("Euroliga")){
            precioFinal += 75;
        }
        if (this.club.equalsIgnoreCase("Barçca") || this.club.equalsIgnoreCase("Madrid")){
            precioFinal += 75;
        }
    }
    @Override
    public void calcularPuntuacion() {
        this.puntuacionFinal = PUNTUACION_BASE;
        if (this.competicion.equalsIgnoreCase("Euroliga")){
            puntuacionFinal += 3;
        }
        if (this.competicion.equalsIgnoreCase("ACB")){
            puntuacionFinal += 2;
        }
        if (this.club.equalsIgnoreCase("Barçca") || this.club.equalsIgnoreCase("Madrid")){
            puntuacionFinal += 1;
        }
    }


}
