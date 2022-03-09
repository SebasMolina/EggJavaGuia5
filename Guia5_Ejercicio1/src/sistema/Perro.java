package sistema;

/**
 *
 * @author Sebas
 */
public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre, int edad, String alimento, String raza) {
        super(nombre, edad, alimento, raza);
    }
    
    @Override
    public void alimentarse() {
        System.out.printf("Perro: %s se alimenta con %s\n",this.getNombre(),this.getAlimento());
    }
    
}
