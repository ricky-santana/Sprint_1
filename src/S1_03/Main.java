package S1_03;

import S1_03.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Redactor> redactores = new ArrayList<Redactor>(); // Lo necesito para el ej 3
    static Scanner entrada = new Scanner(System.in);

    void main (){
        byte menu = 0;
        String nombreRedactor = "";
        String dniRedactor = "";
        String respuesta = "";
        int idBusquedaRedactor = 0;
        int idNoticia = 0;
        String tituloNoticia = "";


        while (menu != 8) {
            System.out.println("Qué desea hacer?\n"
                    + "1. Introducir redactor\n"
                    + "2. Eliminar redactor\n"
                    + "3. Introducir noticia a un redactor\n"
                    + "4. Eliminar noticia\n"
                    + "5. Mostrar todas las noticias de un redactor\n"
                    + "6. Calcular puntuación de una noticia\n"
                    + "7. Calcular precio de una noticia\n"
                    + "8. salir.\n");
            menu = entrada.nextByte();
            entrada.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Introduce el nombre del redactor");
                    nombreRedactor = entrada.nextLine();
                    System.out.println("Introduce el DNI del redactor");
                    dniRedactor = entrada.nextLine();
                    respuesta = addRedactor(nombreRedactor, dniRedactor);
                    break;
                case 2:
                    System.out.println("Introduce el DNI del redactor");
                    dniRedactor = entrada.nextLine();
                    respuesta = deleteRedactor(dniRedactor);
                    break;
                case 3:
                    System.out.println("Introduce el DNI del redactor");
                    dniRedactor = entrada.nextLine();
                    idBusquedaRedactor = buscarRedactor(dniRedactor);
                    if (idBusquedaRedactor == -1) {
                        respuesta = "el redactor no existe";
                    } else {
                        respuesta = addNoticia(idBusquedaRedactor);
                    }
                    break;
                case 4:
                    System.out.println("Introduce el DNI del redactor al que pertenece la noticia");
                    dniRedactor = entrada.nextLine();
                    idBusquedaRedactor = buscarRedactor(dniRedactor);
                    if (idBusquedaRedactor == -1) {
                        respuesta = "el redactor no existe";
                    } else {
                        System.out.println("Intica el titulo de la noticia");
                        tituloNoticia = entrada.nextLine();
                        respuesta = deleteNoticia(idBusquedaRedactor, tituloNoticia);
                    }
                    break;
                case 5:
                    System.out.println("Introduce el DNI del redactor para ver todas sus noticias");
                    dniRedactor = entrada.nextLine();
                    idBusquedaRedactor = buscarRedactor(dniRedactor);
                    if (idBusquedaRedactor == -1) {
                        respuesta = "el redactor no existe";
                    } else {
                        redactores.get(idBusquedaRedactor).mostrarNoticias();
                    };
                    break;
                case 6:
                    System.out.println("Introduce el DNI del redactor de la notica");
                    dniRedactor = entrada.nextLine();
                    System.out.println("Intica el título de la noticia al que quieras calcularle la puntuación");
                    tituloNoticia = entrada.nextLine();
                    idBusquedaRedactor = buscarRedactor(dniRedactor);
                    idNoticia = buscarNoticia(idBusquedaRedactor, tituloNoticia);

                    if (idBusquedaRedactor == -1) {
                        respuesta = "el redactor no existe";
                    } else if (idNoticia == -1){
                        respuesta = "la noticia no existe";
                    } else {
                        redactores.get(idBusquedaRedactor).getListaNoticias().get(idNoticia).calcularPuntuacion();
                        respuesta = "puntuación actualizada:" + redactores.get(idBusquedaRedactor).getListaNoticias().get(idNoticia).getPuntuacionFinal();
                    }
                    break;
                case 7:
                    System.out.println("Introduce el DNI del redactor de la notica");
                    dniRedactor = entrada.nextLine();
                    System.out.println("Intica el título de la noticia al que quieras calcularle la puntuación");
                    tituloNoticia = entrada.nextLine();
                    idBusquedaRedactor = buscarRedactor(dniRedactor);
                    idNoticia = buscarNoticia(idBusquedaRedactor, tituloNoticia);

                    if (idBusquedaRedactor == -1) {
                        respuesta = "el redactor no existe";
                    } else if (idNoticia == -1){
                        respuesta = "la noticia no existe";
                    } else {
                        redactores.get(idBusquedaRedactor).getListaNoticias().get(idNoticia).calcularPrecio();
                        respuesta = "Precio actualizado: " + redactores.get(idBusquedaRedactor).getListaNoticias().get(idNoticia).getPrecioFinal();
                    }
                    break;
                case 8:
                    respuesta = "adiós";
                    break;

            }
            System.out.println(respuesta);
        }

    }

    public int buscarRedactor (String dni){
        int id = -1;
        int i = 0;
        while (id == -1 && i < redactores.size()){
            if (dni.equalsIgnoreCase(redactores.get(i).getDni())){
                id = i;
            }
            i ++;
        }
        return id;
    }

    public String addRedactor (String nombre, String dni){
        String respuesta = "El redactor ya existe";
        int id = 0;
        id = buscarRedactor(dni);
        if (id != -1){
            redactores.add(new Redactor(nombre,dni));
            respuesta = "Redactor añadido";
        }
        return respuesta;
    }

    public String deleteRedactor (String dni){
        String respuesta = "El redactor no existe";
        int id = 0;
        id = buscarRedactor(dni);
        if (id != -1){
            redactores.remove(id);
            respuesta = "Redactor eliminado";
        }
        return respuesta;
    }
    public String addNoticia (int idRedactor){
        int menu = 0;
        String titular = "";
        String texto = "";
        int puntuacion = 0;
        double precio = 0d;
        String competicion = "";
        String club = "";
        String jugador = "";
        String tenistas = "";
        String escuderia = "";
        String equipo = "";
        String respuesta = "La noticia no se ha añadido";

        // Datos comunes a todas las noticias
        System.out.println("Titular:");
        titular = entrada.nextLine();
        System.out.println("Texto:");
        texto = entrada.nextLine();
        System.out.println("Puncuación:");
        puntuacion = entrada.nextInt();
        System.out.println("Precio:");
        precio = entrada.nextDouble();
        entrada.nextLine();

        // Tipo de noticia
        System.out.println("Seleccione un tipo de noticia:" +
                "1. Noticia de Fútbol" +
                "2. Noticia de Basket" +
                "3. Noticia de Tenis" +
                "4. Noticia de F1" +
                "5. Noticia de Moto");
        switch (menu){
            case 1:
                System.out.println("Competición:");
                competicion = entrada.nextLine();
                System.out.println("Club:");
                club = entrada.nextLine();
                System.out.println("Jugador:");
                jugador = entrada.nextLine();
                NoticiaFutbol noticiaFutbol = new NoticiaFutbol(titular, texto, puntuacion, precio, competicion, club, jugador);
                redactores.get(idRedactor).getListaNoticias().add(noticiaFutbol);
                respuesta = "Noticia de fútbol añadida";
                break;
            case 2:
                System.out.println("Competición:");
                competicion = entrada.nextLine();
                System.out.println("Club:");
                club = entrada.nextLine();
                NoticiaBaloncesto noticiaBaloncesto = new NoticiaBaloncesto(titular, texto, puntuacion, precio, competicion, club);
                redactores.get(idRedactor).getListaNoticias().add(noticiaBaloncesto);
                respuesta = "Noticia de basket añadida";
                break;
            case 3:
                System.out.println("tenistas:");
                tenistas = entrada.nextLine();
                NoticiaTenis noticiaTenis = new NoticiaTenis(titular, texto, puntuacion, precio, tenistas);
                redactores.get(idRedactor).getListaNoticias().add(noticiaTenis);
                respuesta = "Noticia de Tenis añadida";
                break;
            case 4:
                System.out.println("Escudería:");
                escuderia = entrada.nextLine();
                NoticiaF1 noticiaF1 = new NoticiaF1(titular, texto, puntuacion, precio, escuderia);
                redactores.get(idRedactor).getListaNoticias().add(noticiaF1);
                respuesta = "Noticia de F1 añadida";
                break;
            case 5:
                System.out.println("Equipo:");
                equipo = entrada.nextLine();
                NoticiaMoto noticiaMoto = new NoticiaMoto (titular, texto, puntuacion, precio,equipo);
                redactores.get(idRedactor).getListaNoticias().add(noticiaMoto);
                respuesta = "Noticia de Moto añadida";
                break;
        }
        return respuesta;
    }
    public int buscarNoticia (int idRedactor, String titulo){
        int idNoticia = -1;
        int i = 0;
        while (idNoticia == -1 && i < redactores.get(idRedactor).getListaNoticias().size()){
            if (titulo.equalsIgnoreCase(redactores.get(idRedactor).getListaNoticias().get(i).getTitular())){
                idNoticia = i;
            }
            i ++;
        }
        return idNoticia;
    }

    public String deleteNoticia (int idRedactor, String titulo){
        String respuesta = "";
        int idNoticia = 0;

        idNoticia = buscarNoticia(idRedactor, titulo);

        if(idNoticia == -1){
            respuesta = "La noticia no existe";
        } else {
            redactores.get(idRedactor).getListaNoticias().remove(idNoticia);
            respuesta = "noticia eliminada";
        }
        return respuesta;
    }
}

