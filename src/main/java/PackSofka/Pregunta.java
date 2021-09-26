/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackSofka;

public class Pregunta {

    /**
     * @return the respuestas
     */
    public String[] getRespuestas() {
        return respuestas;
    }

    /**
     * @param respuestas the respuestas to set
     */
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }

    //ATRIBUTOS
    private String pregunta;
    private String[] respuestas;
    private int respuetaCorrecta;

    //SET AND GET
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Pregunta() {
        this.respuestas = new String[4];
    }    

    /**
     * @return the respuetaCorrecta
     */
    public int getRespuetaCorrecta() {
        return respuetaCorrecta;
    }

    /**
     * @param respuetaCorrecta the respuetaCorrecta to set
     */
    public void setRespuetaCorrecta(int respuetaCorrecta) {
        this.respuetaCorrecta = respuetaCorrecta;
    }
}
