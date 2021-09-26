/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackSofka;


public class Categoria {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the Pregunta
     */
    public Pregunta[] getPregunta() {
        return Pregunta;
    }

    /**
     * @param Pregunta the Pregunta to set
     */
    public void setPregunta(Pregunta[] Pregunta) {
        this.Pregunta = Pregunta;
    }
    
    public Categoria(){
        this.Pregunta = new Pregunta[5];
    }
    
    private String nombre;
    private Pregunta[] Pregunta;
}
