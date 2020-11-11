/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_27oct;

/**
 * Clase que registra el nombre de una persona y lo muestra
 * @author Nestor pc
 */
public class Persona {
    private String nombre;
    private String apellido;
    private Fecha fNacimiento;

    public Persona() {
    }

    public Persona(String nombre, 
            String apellido, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = fNacimiento;
    }

    public Persona(String nombre, String apellido,int dia,int mes,int año) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fNacimiento = new Fecha(dia,mes,año);
    }
    
    
/**
 * Recupera nombre
 * @return nombre 
 */
    public String getNombre() {
        return nombre;
    }
/**
 * Registra el nombre
 * @param nombre 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 *  Recupera apellido
 * @return apellido
 */
    public String getApellido() {
        return apellido;
    }
/**
 * Registra apellido
 * @param apellido 
 */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
/**
 * Recupera la fecha de nacimiento
 * @return 
 */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
/**
 * Registra la fecha de nacimiento
 * @param fNacimiento 
 */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
/**
 * 
 * Se imprime el objeto persona y fnacimiento 
 */
    public String toString() {
        return "Persona{" + 
                "nombre=" + nombre + 
                ", apellido=" + apellido 
                + ", fNacimiento=" + 
                fNacimiento + '}';
    }
    
    
}
