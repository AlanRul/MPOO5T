
package clase_27oct;
/**
 *
 * @author Néstor Hurtado  
 * @author Rul Domínguez
 */
public class Clase_27Oct {

    
    public static void main(String[] args) {
        Circulo cir1= new Circulo();
        //cir1.radio = 4.5f;
        cir1.setRadio(3.4f);
        System.out.println("Radio del circulo 1 = "+cir1.getRadio());
        
        Circulo cir2 = new Circulo(6.0f);
        System.out.println("rafio cir2 = "+cir2.getRadio());
        cir2.setRadio(9.0f);
        System.out.println("rafio cir2 = "+cir2.getRadio());
        cir2.setRadio(77.0f);
        System.out.println("Radio= "+cir2.getRadio());
        
        System.out.println("perimetro cir1= "+cir1.perimetro());
        
        System.out.println("Info de circulo 1 "+cir1.toString());
        
        System.out.println("1**************************************");
        
        Persona amigo = new Persona();
        System.out.println("Info Amigo: "+amigo.toString());
        amigo.setNombre("Juan");
        amigo.setApellido("Morales");
        amigo.setfNacimiento(new Fecha(29,1,2000));
        System.out.println("Info Amigo: "+amigo.toString());
        System.out.println("Info Amigo: "+amigo);
        
        System.out.println("2**************************************");
        
        Persona persona =new Persona("Jose","Rodriguez",4,8,1990);
        System.out.println("Info Amigo: "+persona);
        
        System.out.println("3**************************************");
        
        Triangulo triangulo = new Triangulo(12,8);
        System.out.println("Infor Triangulo = "+triangulo);
        
        
    }
    
}
