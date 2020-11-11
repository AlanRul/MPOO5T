
package clase_27oct;
/**
 * Clase que obtiene el perimetro como el área de un circulo.
 * @author Nestor pc
 */

public class Circulo {
    static double PI = Math.PI;
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }
/**
 * Retoma el radio
 * @return radio 
 */
    public float getRadio() {
        return radio;
    }
/**
 * Sirve para registrar el Radio
 * @param radio se ingresa el radio
 */
    public void setRadio(float radio) {
        this.radio = radio;
    }
/**
 * Impreme los datos guardados en circulo
 * @return regresa el ciruclo  
 */
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }
/**
 * Calcula el perimetro del circulo
 * @return el perimetro del circulo
 */
    public float perimetro(){
        return (float) (2*PI*radio);
    }
/**
 * Calcula el área del circulo
 * @return Área del circulo
 */
    public float area(){
        return (float)(PI*radio*radio);
    }   
}
