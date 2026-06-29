package S1_03;

public abstract class Noticia {
    private String titular;
    private String texto;
    private int puntuacion;
    private double precio;

    public Noticia (String titular, String texto, int puntuacion, double precio){
        this.titular = titular;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.precio = precio;
    }

    public abstract void calcularPrecio ();
    public abstract void calcularPuntuacion ();
}
