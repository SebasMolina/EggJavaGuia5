package sistema;

/**
 *
 * @author Sebas
 */
public class Gato extends Animal{

    public Gato() {
    }

    public Gato(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    @Override
    public void alimentarse() {
        System.out.printf("Gato: %s se alimenta con %s\n",this.getNombre(),this.getAlimento());
    }
    
    
}
