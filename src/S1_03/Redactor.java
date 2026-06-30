package S1_03;

import java.util.ArrayList;

public class Redactor {
    private final String nombre;
    private final String dni;
    private static double sueldo = 1500d;
    private ArrayList<Noticia> listaNoticias;

    public Redactor(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.listaNoticias = new ArrayList<>();
    }

    public ArrayList<Noticia> getListaNoticias() {
        return listaNoticias;
    }

    public String getDni() {
        return dni;
    }


    public static void setSueldo(double sueldo) {
        Redactor.sueldo = sueldo;
    }

    public void addNoticia (Noticia noticia){
        listaNoticias.add(noticia);
    }
    public void deleteNoticia (int idNoticia){
        listaNoticias.remove(idNoticia);
    }

    public String mostrarNoticias () {
        String respuesta = "Noticias del redactor " + this.nombre + ":\n";
        for(Noticia noticia : this.listaNoticias) {
            respuesta += noticia.getTitular() + "\n";
        }
        respuesta += "____________\n";
        return respuesta;
    }
}
