/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo. 
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del 
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá 
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar 
una clase Main que realice lo siguiente:

*/
package sistema;

/**
 *
 * @author Sebas
 */
public class Sistema {

    public static void main(String[] args) {
        
        Animal perro = new Perro("Stich",15,"Carnivoro","Doberman");
        perro.alimentarse();
        
        Perro perro1 = new Perro("Teddy",10,"Croquetas","Chihuahua");
        perro1.alimentarse();
    }
    
}
