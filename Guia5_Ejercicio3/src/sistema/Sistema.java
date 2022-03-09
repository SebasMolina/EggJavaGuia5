package sistema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebas
 */
public class Sistema {
    /*
    Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de 
    Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o 
    televisores, con valores ya asignados.
    Luego, recorrer este array y ejecutar el método precioFinal() en cada 
    electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto, 
    es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho 
    eso, también deberemos mostrar, la suma del precio de todos los 
    Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000 
    y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
    electrodomésticos, 2000 para lavadora y 5000 para televisor
    */
    
    public static void main(String[] args) {
        List<Electrodomestico> lista = new ArrayList<>();
        Electrodomestico primerElectrodomestico = new Electrodomestico(70000,"rojo",'b',60);
        Lavadora segundoElectrodomestico = new Lavadora(50,30000,"blanco",'a',10);
        Televisor tercerElectrodomestico = new Televisor(50,false,40000,"gris",'c',8);
        Televisor cuartoElectrodomestico = new Televisor(21,true,6000,"gris",'f',10);
        
        lista.add(primerElectrodomestico);
        lista.add(segundoElectrodomestico);
        lista.add(tercerElectrodomestico);
        lista.add(cuartoElectrodomestico);
        
        double precioElectrodomesticos=0, precioLavadoras=0, precioTelevisores=0;
        for (Electrodomestico electrodomestico : lista) {
            electrodomestico.precioFinal();
            if(electrodomestico instanceof Lavadora){
                precioLavadoras += electrodomestico.precio;
            }
            if(electrodomestico instanceof Televisor){
                precioTelevisores +=  electrodomestico.precio;
            }
            if(electrodomestico instanceof Electrodomestico){
                precioElectrodomesticos += electrodomestico.precio;
            }
            System.out.println("Precio Lavadoras: "+precioLavadoras);
            System.out.println("Precio Televisores: "+precioTelevisores);
            System.out.println("Precio Electrodomesticos: "+precioElectrodomesticos);
        }
        System.out.println("**********************************************************");
        System.out.println("Precio Lavadoras: "+precioLavadoras);
        System.out.println("Precio Televisores: "+precioTelevisores);
        System.out.println("Precio Electrodomesticos: "+precioElectrodomesticos);
    }
    
}
