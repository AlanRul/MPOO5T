/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_27oct;

/**
 * Esta clase es un triangulo y se utiliza para obtener sus caracteristicas
 * @author Nestor pc
 */
public class Triangulo {
    private float cateto1;
    private float cateto2;
    private float angulo1;
    private float angulo2;
    private float hipotenusa;

    public Triangulo() {
    /**
     *
     * @param cateto1 Cateto A de tipo real
     * @param cateto2 Cateto B de tipo real
     */
    }

    public Triangulo(float cateto1, float cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
        hipotenusa();
        angulo();
    }
    /**
     * 
     * @return cateto1 Método get cateto 1 
     */
    
    

    public float getCateto1() {
        return cateto1;
    }
    
    
    public void setCateto1(float cateto1) {
        this.cateto1 = cateto1;
    }

    public float getCateto2() {
        return cateto2;
    }

    public void setCateto2(float cateto2) {
        this.cateto2 = cateto2;
    }

    public float getAngulo1() {
        return angulo1;
    }

    public void setAngulo1(float angulo1) {
        this.angulo1 = angulo1;
    }

    public float getAngulo2() {
        return angulo2;
    }

    public void setAngulo2(float angulo2) {
        this.angulo2 = angulo2;
    }

    public float getHipotenusa() {
        return hipotenusa;
    }

    public void setHipotenusa(float hipotenusa) {
        this.hipotenusa = hipotenusa;
    }
/**
 * 
 * Imprime toda la información del objeto
 */
    @Override
    public String toString() {
        return "Triangulo{" + "cateto1="
                + "" + cateto1 + ", cateto2=" + cateto2 
                + ", angulo1=" + angulo1 + ", angulo2=" 
                + angulo2 + ", hipotenusa=" + hipotenusa + '}';
    }
   /**
    * 
    * Calcula el valor de la hipotenusa
    */
    private void hipotenusa(){
        this.hipotenusa = (float) Math.sqrt
        (Math.pow(cateto1,2)+Math.pow(cateto2,2));
    }
    /**
     * Calcula los dos angulos (no rectos)
     */
    private void angulo(){
        this.angulo1 = (float)Math.toDegrees
        (Math.atan(cateto2/cateto1));
        this.angulo2=180-90-angulo1;
    }
    /**
     * Calcula el area
     * @return area
     */
    public float area(){
        return (cateto1*cateto2)/2;
    }
    /**
     * Calcula el perimetro
     * @return perimetro
     */
    public float perimetro(){
        return cateto1+cateto2+hipotenusa;
    }
}
