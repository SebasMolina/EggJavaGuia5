package sistema;

/**
 *
 * @author Sebas
 */
public class Caballo extends Animal{

    public Caballo() {
    }

    public Caballo(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }

    
    @Override
    public void alimentarse() {
        System.out.printf("Caballo: %s se alimenta con %s\n",this.getNombre(),this.getAlimento());
    }
    
    
}
