/*

*/
package sistema;

/**
 *
 * @author Sebas
 */
public class Sistema {

    public static void main(String[] args) {
        Electrodomestico heladera = new Electrodomestico();
        heladera.crearElectrodomestico();
        System.out.println("*****************************");
        Electrodomestico lavarropa = new Lavadora();
        lavarropa.crearElectrodomestico();
        System.out.println("*****************************");
        Electrodomestico tele = new Televisor();
        tele.crearElectrodomestico();
        System.out.println(heladera);
        System.out.println(lavarropa);
        System.out.println(tele);
        
    }
    
}
