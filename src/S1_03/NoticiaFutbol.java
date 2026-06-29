package S1_03;

public class NoticiaFutbol extends Noticia{
    private final String competicion;
    private final String club;
    private final String jugador;
    private static final double precioBase = 300d;
    private double precioFinal;
    private static final int puntuacionBase = 5;
    private int puntuacionFinal;


    public NoticiaFutbol(String titular, String texto, int puntuacion, double precio, String competicion, String club, String jugador) {
        super(titular, texto, puntuacion, precio);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
        this.precioFinal = 0d;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }
    public double getPuntuacionFinal() {
        return puntuacionFinal;
    }

    @Override
    public void calcularPrecio() {
        precioFinal = precioBase;

        if (this.competicion.equalsIgnoreCase("Liga de Campeones")){
            precioFinal += 100;
        }
        if (this.club.equalsIgnoreCase("Barçca") || this.club.equalsIgnoreCase("Madrid")){
            precioFinal += 100;
        }
        if (this.jugador.equalsIgnoreCase("Ferran") || this.jugador.equalsIgnoreCase("Benzema")){
            precioFinal +=50;
        }
    }
    @Override
    public void calcularPuntuacion() {
        this.puntuacionFinal = puntuacionBase;

        if (this.competicion.equalsIgnoreCase("Liga de campeones")){
            puntuacionFinal += 3;
        }
        if (this.competicion.equalsIgnoreCase("La liga")){
            puntuacionFinal += 2;
        }
        if (this.club.equalsIgnoreCase("Barçca") || this.club.equalsIgnoreCase("Madrid")){
            puntuacionFinal += 1;
        }
        if (this.jugador.equalsIgnoreCase("Ferran") || this.jugador.equalsIgnoreCase("Benzema")){
            puntuacionFinal +=1;
        }
    }


}
