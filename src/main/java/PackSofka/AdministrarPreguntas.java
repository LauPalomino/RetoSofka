/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackSofka;

import PackSofka.Categoria;
import PackSofka.Pregunta;

public class AdministrarPreguntas {


    Categoria c1, c2, c3, c4, c5;

    
    public AdministrarPreguntas() {
        c1 = new Categoria();
        c2 = new Categoria();
        c3 = new Categoria();
        c4 = new Categoria();
        c5 = new Categoria();
        cargarPreguntasC1();
        cargarPreguntasC2();
        cargarPreguntasC3();
        cargarPreguntasC4();
        cargarPreguntasC5();
    }

    public Pregunta getPreguntaPorCategoria(int categoria, int preguntaNo) {
        System.out.println("\nCategoria: "+categoria);
        switch (categoria) {
            case 1:return c1.getPregunta()[preguntaNo];
            case 2:return c2.getPregunta()[preguntaNo];
            case 3:return c3.getPregunta()[preguntaNo];
            case 4:return c4.getPregunta()[preguntaNo];
            case 5:return c5.getPregunta()[preguntaNo];
            default:System.out.println("Default");
        }
        return null;
    }

    private void cargarPreguntasC1() {
        c1.setNombre("\nCategoria 1");
        c1.getPregunta()[0] = new Pregunta();
        c1.getPregunta()[0].setPregunta("1. ¿Cuántos minutos tiene una hora?");
        c1.getPregunta()[0].getRespuestas()[0] = "60";
        c1.getPregunta()[0].getRespuestas()[1]= "120";
        c1.getPregunta()[0].getRespuestas()[2]= "24";
        c1.getPregunta()[0].getRespuestas()[3]= "32";
        c1.getPregunta()[0].setRespuetaCorrecta(0);

        c1.getPregunta()[1] = new Pregunta();
        c1.getPregunta()[1].setPregunta("1.¿Cuántas patas tiene una araña?");
        c1.getPregunta()[1].getRespuestas()[0]="6";
        c1.getPregunta()[1].getRespuestas()[1]="4";
        c1.getPregunta()[1].getRespuestas()[2]="8";
        c1.getPregunta()[1].getRespuestas()[3]="12";
        c1.getPregunta()[1].setRespuetaCorrecta(2);

        c1.getPregunta()[2] = new Pregunta();
        c1.getPregunta()[2].setPregunta("1.¿Qué planeta es el más cercano al Sol?");
        c1.getPregunta()[2].getRespuestas()[0]="Venus";
        c1.getPregunta()[2].getRespuestas()[1]="Marte";
        c1.getPregunta()[2].getRespuestas()[2]="Júpiter";
        c1.getPregunta()[2].getRespuestas()[3]="Mercurio";
        c1.getPregunta()[2].setRespuetaCorrecta(3);

        c1.getPregunta()[3] = new Pregunta();
        c1.getPregunta()[3].setPregunta("1.¿Cada cuántos años tenemos un año bisiesto?");
        c1.getPregunta()[3].getRespuestas()[0]="4";
        c1.getPregunta()[3].getRespuestas()[1]="6";
        c1.getPregunta()[3].getRespuestas()[2]="2";
        c1.getPregunta()[3].getRespuestas()[3]="3";
        c1.getPregunta()[3].setRespuetaCorrecta(0);

        c1.getPregunta()[4] = new Pregunta();
        c1.getPregunta()[4].setPregunta("1.¿En qué país se encuentra la Torre Eiffel?");
        c1.getPregunta()[4].getRespuestas()[0]="París";
        c1.getPregunta()[4].getRespuestas()[1]="Francia";
        c1.getPregunta()[4].getRespuestas()[2]="Estados Unidos";
        c1.getPregunta()[4].getRespuestas()[3]="Canada";
        c1.getPregunta()[4].setRespuetaCorrecta(1);
    }

    private void cargarPreguntasC2() {
        c2.setNombre("\nCategoria 2");
        c2.getPregunta()[0] = new Pregunta();
        c2.getPregunta()[0].setPregunta("2.¿Cuál es la montaña más alta en la actualidad?");
        c2.getPregunta()[0].getRespuestas()[0]="Aconcagua";
        c2.getPregunta()[0].getRespuestas()[1]="Kilimanjaro";
        c2.getPregunta()[0].getRespuestas()[2]="Everest";
        c2.getPregunta()[0].getRespuestas()[3]="Nevado Ojos del Salado";
        c2.getPregunta()[0].setRespuetaCorrecta(2);

        c2.getPregunta()[1] = new Pregunta();
        c2.getPregunta()[1].setPregunta("2.¿Cuál es el río más largo del mundo?");
        c2.getPregunta()[1].getRespuestas()[0]="Amazonas";
        c2.getPregunta()[1].getRespuestas()[1]="Nilo";
        c2.getPregunta()[1].getRespuestas()[2]="Yenisei";
        c2.getPregunta()[1].getRespuestas()[3]="Congo";
        c2.getPregunta()[1].setRespuetaCorrecta(0);

        c2.getPregunta()[2] = new Pregunta();
        c2.getPregunta()[2].setPregunta("2.El resultado de: 5+(8*9) es:");
        c2.getPregunta()[2].getRespuestas()[0]="82";
        c2.getPregunta()[2].getRespuestas()[1]="117";
        c2.getPregunta()[2].getRespuestas()[2]="72";
        c2.getPregunta()[2].getRespuestas()[3]="77";
        c2.getPregunta()[2].setRespuetaCorrecta(3);

        c2.getPregunta()[3] = new Pregunta();
        c2.getPregunta()[3].setPregunta("2.¿Cuál es el animal más grande de la Tierra?");
        c2.getPregunta()[3].getRespuestas()[0]="Elefante";
        c2.getPregunta()[3].getRespuestas()[1]="Ballena azul";
        c2.getPregunta()[3].getRespuestas()[2]="Orca";
        c2.getPregunta()[3].getRespuestas()[3]="Hipopotamo";
        c2.getPregunta()[3].setRespuetaCorrecta(1);

        c2.getPregunta()[4] = new Pregunta();
        c2.getPregunta()[4].setPregunta("2.¿Cuántos huesos tiene el cuerpo humano?");
        c2.getPregunta()[4].getRespuestas()[0]="106";
        c2.getPregunta()[4].getRespuestas()[1]="208";
        c2.getPregunta()[4].getRespuestas()[2]="206";
        c2.getPregunta()[4].getRespuestas()[3]="108";
        c2.getPregunta()[4].setRespuetaCorrecta(2);
    }

    private void cargarPreguntasC3() {
        c3.setNombre("\nCategoria 3");
        c3.getPregunta()[0] = new Pregunta();
        c3.getPregunta()[0].setPregunta("3.¿Cuál es la luna más grande de Saturno?");
        c3.getPregunta()[0].getRespuestas()[0]="Titán";
        c3.getPregunta()[0].getRespuestas()[1]="Encélado";
        c3.getPregunta()[0].getRespuestas()[2]="Dione";
        c3.getPregunta()[0].getRespuestas()[3]="Tetis";
        c3.getPregunta()[0].setRespuetaCorrecta(0);

        c3.getPregunta()[1] = new Pregunta();
        c3.getPregunta()[1].setPregunta("3.¿Cuál es el álbum musical más vendido de la historia?");
        c3.getPregunta()[1].getRespuestas()[0]="Love, Forever Changes";
        c3.getPregunta()[1].getRespuestas()[1]="The Beach Boys, Pet Sounds";
        c3.getPregunta()[1].getRespuestas()[2]="Robert Johnson, King of the Delta Blues Singers";
        c3.getPregunta()[1].getRespuestas()[3]="Thriller, de Michael Jackson.";
        c3.getPregunta()[1].setRespuetaCorrecta(3);

        c3.getPregunta()[2] = new Pregunta();
        c3.getPregunta()[2].setPregunta("3.¿Cuál es el futbolista con más balones de oro?");
        c3.getPregunta()[2].getRespuestas()[0]="Cristiano Ronaldo";
        c3.getPregunta()[2].getRespuestas()[1]="Lionel Messi";
        c3.getPregunta()[2].getRespuestas()[2]="Neymar";
        c3.getPregunta()[2].getRespuestas()[3]="Luis Suarez";
        c3.getPregunta()[2].setRespuetaCorrecta(1);

        c3.getPregunta()[3] = new Pregunta();
        c3.getPregunta()[3].setPregunta("3.¿Quién ideó las leyes de la herencia genética?");
        c3.getPregunta()[3].getRespuestas()[0]="Gregor Mendel";
        c3.getPregunta()[3].getRespuestas()[1]="Charles Darwin";
        c3.getPregunta()[3].getRespuestas()[2]="Nikola Tesla";
        c3.getPregunta()[3].getRespuestas()[3]="Marie Curie";
        c3.getPregunta()[3].setRespuetaCorrecta(0);

        c3.getPregunta()[4] = new Pregunta();
        c3.getPregunta()[4].setPregunta("3.¿En qué año se inventó la imprenta?");
        c3.getPregunta()[4].getRespuestas()[0]="1444";
        c3.getPregunta()[4].getRespuestas()[1]="1607";
        c3.getPregunta()[4].getRespuestas()[2]="1440";
        c3.getPregunta()[4].getRespuestas()[3]="1670";
        c3.getPregunta()[4].setRespuetaCorrecta(2);
    }

    private void cargarPreguntasC4() {
        c4.setNombre("\nCategoria 4");
        c4.getPregunta()[0] = new Pregunta();
        c4.getPregunta()[0].setPregunta("4.¿Cuál es el mineral más duro del planeta?");
        c4.getPregunta()[0].getRespuestas()[0]="Fluorita";
        c4.getPregunta()[0].getRespuestas()[1]="Corindon";
        c4.getPregunta()[0].getRespuestas()[2]="Cuarzo";
        c4.getPregunta()[0].getRespuestas()[3]="Diamante";
        c4.getPregunta()[0].setRespuetaCorrecta(3);

        c4.getPregunta()[1] = new Pregunta();
        c4.getPregunta()[1].setPregunta("4.¿Cuál fue la primera película de Disney?");
        c4.getPregunta()[1].getRespuestas()[0]="Sirenita";
        c4.getPregunta()[1].getRespuestas()[1]="Blanca nieves y los siete enanitos";
        c4.getPregunta()[1].getRespuestas()[2]="Bella Durmiente";
        c4.getPregunta()[1].getRespuestas()[3]="Cenicienta";
        c4.getPregunta()[1].setRespuetaCorrecta(1);

        c4.getPregunta()[2] = new Pregunta();
        c4.getPregunta()[2].setPregunta("4.¿En qué país nació Adolf Hitler?");
        c4.getPregunta()[2].getRespuestas()[0]="Holanda";
        c4.getPregunta()[2].getRespuestas()[1]="Bélgica";
        c4.getPregunta()[2].getRespuestas()[2]="Austria";
        c4.getPregunta()[2].getRespuestas()[3]="Luxemburgo";
        c4.getPregunta()[2].setRespuetaCorrecta(2);

        c4.getPregunta()[3] = new Pregunta();
        c4.getPregunta()[3].setPregunta("4.¿Cuánto duró “La Guerra de los Cien Años”?");
        c4.getPregunta()[3].getRespuestas()[0]="100 años";
        c4.getPregunta()[3].getRespuestas()[1]="116 años";
        c4.getPregunta()[3].getRespuestas()[2]="101 años";
        c4.getPregunta()[3].getRespuestas()[3]="122 años";
        c4.getPregunta()[3].setRespuetaCorrecta(1);

        c4.getPregunta()[4] = new Pregunta();
        c4.getPregunta()[4].setPregunta("4.¿Quién descubrió la penicilina?");
        c4.getPregunta()[4].getRespuestas()[0]="Louis Pasteur";
        c4.getPregunta()[4].getRespuestas()[1]="Robert Koch";
        c4.getPregunta()[4].getRespuestas()[2]="Anton Van Leeuwenhoek";
        c4.getPregunta()[4].getRespuestas()[3]="Alexander Fleming";
        c4.getPregunta()[4].setRespuetaCorrecta(3);
    }

    private void cargarPreguntasC5() {
        c5.setNombre("\nCategoria 5");
        c5.getPregunta()[0] = new Pregunta();
        c5.getPregunta()[0].setPregunta("5.¿Cuál es el gas mayoritario de la atmósfera terrestre?");
        c5.getPregunta()[0].getRespuestas()[0]="Nitrogeno";
        c5.getPregunta()[0].getRespuestas()[1]="Oxigeno";
        c5.getPregunta()[0].getRespuestas()[2]="Dioxido de carbono";
        c5.getPregunta()[0].getRespuestas()[3]="Argón";
        c5.getPregunta()[0].setRespuetaCorrecta(0);

        c5.getPregunta()[1] = new Pregunta();
        c5.getPregunta()[1].setPregunta("5.En la mitología griega, ¿quién mató a Aquiles?");
        c5.getPregunta()[1].getRespuestas()[0]="Zeus";
        c5.getPregunta()[1].getRespuestas()[1]="Paris";
        c5.getPregunta()[1].getRespuestas()[2]="Hera";
        c5.getPregunta()[1].getRespuestas()[3]="Odiseo";
        c5.getPregunta()[1].setRespuetaCorrecta(1);

        c5.getPregunta()[2] = new Pregunta();
        c5.getPregunta()[2].setPregunta("5.De acuerdo a la Biblia, ¿cuántos años vivió Matusalén?");
        c5.getPregunta()[2].getRespuestas()[0]="969";
        c5.getPregunta()[2].getRespuestas()[1]="909";
        c5.getPregunta()[2].getRespuestas()[2]="98";
        c5.getPregunta()[2].getRespuestas()[3]="99";
        c5.getPregunta()[2].setRespuetaCorrecta(0);

        c5.getPregunta()[3] = new Pregunta();
        c5.getPregunta()[3].setPregunta("5.¿Cuál es la edad del Universo?");
        c5.getPregunta()[3].getRespuestas()[0]="13.400 millones de años";
        c5.getPregunta()[3].getRespuestas()[1]="1.340 millones de años";
        c5.getPregunta()[3].getRespuestas()[2]="13.800 millones de años";
        c5.getPregunta()[3].getRespuestas()[3]="1.380 millones de años";
        c5.getPregunta()[3].setRespuetaCorrecta(2);

        c5.getPregunta()[4] = new Pregunta();
        c5.getPregunta()[4].setPregunta("5.¿Cuántos años son un lustro?");
        c5.getPregunta()[4].getRespuestas()[0]="Cinco";
        c5.getPregunta()[4].getRespuestas()[1]="Diez";
        c5.getPregunta()[4].getRespuestas()[2]="Veinte";
        c5.getPregunta()[4].getRespuestas()[3]="Cien";
        c5.getPregunta()[4].setRespuetaCorrecta(0);
    }
}
