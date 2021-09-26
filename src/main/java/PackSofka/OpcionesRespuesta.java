/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackSofka;


public class OpcionesRespuesta {

    //ATRIBUTOS
    private String respuesta;
    private boolean esCorrecta = false;

    OpcionesRespuesta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getRespuesta() {
        return respuesta;
    }

    //SET AND GET
    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * @return the esCorrecta
     */
    public boolean isEsCorrecta() {
        return esCorrecta;
    }

    /**
     * @param esCorrecta the esCorrecta to set
     */
    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }
    
    //CONSTRUCTOR
    public OpcionesRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
