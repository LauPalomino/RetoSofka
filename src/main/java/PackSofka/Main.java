/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackSofka;

import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Jugador jugador = new Jugador();
        int respuesta = 0;

        System.out.println("\n------BIENVENIDO------\n");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, ingrese su nombre: ");
        jugador.setNombre(entrada.next());

        while (respuesta == 0) {
            System.out.println("\n Escoja una opcion: ");
            System.out.println("1. Jugar");
            System.out.println("2. Ver Historico");
            System.out.println("3. Salir \n");
            respuesta = (entrada.nextInt());

            switch (respuesta) {
                case 1:
                    System.out.println("Iniciando Juego...");
                    AdministrarPreguntas preguntas = new AdministrarPreguntas();
                    Random rn = new Random();
                    int preguntaNo = rn.nextInt(5);
                    int categoria = 1;
                    boolean continuaJuego = true;
                    Pregunta pregunta;

                    while (continuaJuego) {
                        switch (categoria) {
                            case 1:
                                pregunta = preguntas.getPreguntaPorCategoria(categoria, preguntaNo);
                                System.out.println(pregunta.getPregunta());
                                System.out.println("1 - " + pregunta.getRespuestas()[0]);
                                System.out.println("2 - " + pregunta.getRespuestas()[1]);
                                System.out.println("3 - " + pregunta.getRespuestas()[2]);
                                System.out.println("4 - " + pregunta.getRespuestas()[3]);
                                System.out.println("5 - Retirarse\n");
                                respuesta = (entrada.nextInt()) - 1;
                                if (respuesta == pregunta.getRespuetaCorrecta()) {
                                    jugador.setPuntaje(20);
                                    System.out.println("Correcto!, su puntaje es: " + jugador.getPuntaje());
                                    categoria++;
                                } else if (respuesta == 4) {
                                    System.out.println("Gracias por jugar, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    continuaJuego = false;
                                    //Guardamos la informacion del usuario en el archivo plano
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                } else {
                                    System.out.println("Respuesta incorrecta, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    System.out.println("Gracias por jugar, intentelo nuevamente.");
                                    continuaJuego = false;
                                    respuesta = -1;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                }
                                break;
                            case 2:
                                pregunta = preguntas.getPreguntaPorCategoria(categoria, preguntaNo);
                                System.out.println(pregunta.getPregunta());
                                System.out.println("1 - " + pregunta.getRespuestas()[0]);
                                System.out.println("2 - " + pregunta.getRespuestas()[1]);
                                System.out.println("3 - " + pregunta.getRespuestas()[2]);
                                System.out.println("4 - " + pregunta.getRespuestas()[3]);
                                System.out.println("5 - Retirarse\n");
                                respuesta = (entrada.nextInt()) - 1;
                                if (respuesta == pregunta.getRespuetaCorrecta()) {
                                    jugador.setPuntaje(40);
                                    System.out.println("Correcto!, su puntaje es: " + jugador.getPuntaje());
                                    categoria++;
                                } else if (respuesta == 4) {
                                    System.out.println("Gracias por jugar, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    continuaJuego = false;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                } else {
                                    jugador.setPuntaje(0);
                                    System.out.println("Respuesta incorrecta, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    System.out.println("Gracias por jugar, intentelo nuevamente.");
                                    continuaJuego = false;
                                    respuesta = -1;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                }
                                break;
                            case 3:
                                pregunta = preguntas.getPreguntaPorCategoria(categoria, preguntaNo);
                                System.out.println(pregunta.getPregunta());
                                System.out.println("1 - " + pregunta.getRespuestas()[0]);
                                System.out.println("2 - " + pregunta.getRespuestas()[1]);
                                System.out.println("3 - " + pregunta.getRespuestas()[2]);
                                System.out.println("4 - " + pregunta.getRespuestas()[3]);
                                System.out.println("5 - Retirarse\n");
                                respuesta = (entrada.nextInt()) - 1;
                                if (respuesta == pregunta.getRespuetaCorrecta()) {
                                    jugador.setPuntaje(60);
                                    System.out.println("Correcto!, su puntaje es: " + jugador.getPuntaje());
                                    categoria++;
                                } else if (respuesta == 4) {
                                    System.out.println("Gracias por jugar, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    continuaJuego = false;
                                    respuesta = -1;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                } else {
                                    jugador.setPuntaje(0);
                                    System.out.println("Respuesta incorrecta, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    System.out.println("Gracias por jugar, intentelo nuevamente.");
                                    continuaJuego = false;
                                    respuesta = -1;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                }
                                break;
                            case 4:
                                pregunta = preguntas.getPreguntaPorCategoria(categoria, preguntaNo);
                                System.out.println(pregunta.getPregunta());
                                System.out.println("1 - " + pregunta.getRespuestas()[0]);
                                System.out.println("2 - " + pregunta.getRespuestas()[1]);
                                System.out.println("3 - " + pregunta.getRespuestas()[2]);
                                System.out.println("4 - " + pregunta.getRespuestas()[3]);
                                System.out.println("5 - Retirarse\n");
                                respuesta = (entrada.nextInt()) - 1;
                                if (respuesta == pregunta.getRespuetaCorrecta()) {
                                    jugador.setPuntaje(80);
                                    System.out.println("Correcto!, su puntaje es: " + jugador.getPuntaje());
                                    categoria++;
                                } else if (respuesta == 4) {
                                    System.out.println("Gracias por jugar, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    continuaJuego = false;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                } else {
                                    jugador.setPuntaje(0);
                                    System.out.println("Respuesta incorrecta, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    System.out.println("Gracias por jugar, intentelo nuevamente.");
                                    continuaJuego = false;
                                    respuesta = -1;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                }
                                break;
                            case 5:
                                pregunta = preguntas.getPreguntaPorCategoria(categoria, preguntaNo);
                                System.out.println(pregunta.getPregunta());
                                System.out.println("1 - " + pregunta.getRespuestas()[0]);
                                System.out.println("2 - " + pregunta.getRespuestas()[1]);
                                System.out.println("3 - " + pregunta.getRespuestas()[2]);
                                System.out.println("4 - " + pregunta.getRespuestas()[3]);
                                System.out.println("5 - Retirarse\n");
                                respuesta = (entrada.nextInt()) - 1;
                                if (respuesta == pregunta.getRespuetaCorrecta()) {
                                    jugador.setPuntaje(100);
                                    System.out.println("Correcto!, has ganado el juego con : " + jugador.getPuntaje() + " puntos.");
                                    continuaJuego = false;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                } else if (respuesta == 4) {
                                    System.out.println("Gracias por jugar, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    continuaJuego = false;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                } else {
                                    jugador.setPuntaje(0);
                                    System.out.println("Respuesta incorrecta, su puntaje es: " + jugador.getPuntaje() + " puntos.");
                                    System.out.println("Gracias por jugar, intentelo nuevamente.");
                                    continuaJuego = false;
                                    respuesta = -1;
                                    try {
                                        Files.write(Paths.get("./src/main/java/PackSofka/historico.csv"), ("\n" + jugador.getNombre() + "," + jugador.getPuntaje()).getBytes(), StandardOpenOption.APPEND);
                                    } catch (IOException e) {
                                        System.out.println("Error al escribir en el historico.");
                                    }
                                }
                                break;
                            //default:
                                //break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("\nCargando Historico...");
                    //Leemos el archivo plano
                    File inputFile = new File("./src/main/java/PackSofka/historico.csv");
                    try {
                        Scanner reader = new Scanner(inputFile);
                        while (reader.hasNextLine()) {
                            String data = reader.nextLine();
                            System.out.println(data);

                        }
                        reader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("scanner error");
                        e.printStackTrace();
                    }
                    System.out.println("Presione cualquier tecla para volver al menu.");
                    entrada.nextInt();
                    respuesta = 0;
                    break;

                case 3:
                    break;
                default:
                    System.out.println("Opcion incorrecta, intentelo de nuevo...");
                    respuesta = 0;
                    break;
            }
        }

    }

}
