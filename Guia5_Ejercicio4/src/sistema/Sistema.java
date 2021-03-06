/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro 
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este 
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz, 
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el 
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la 
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las 
formas y se mostrará el resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
*/
package sistema;

/**
 *
 * @author Sebas
 */
public class Sistema {

    public static void main(String[] args) {
        Circulo unCirculo = new Circulo(30);
        Rectangulo unRectangulo = new Rectangulo(5,10);
        System.out.println(unCirculo);
        System.out.println(unRectangulo);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        Circulo otroCirculo = new Circulo(50);
        Rectangulo otroRectangulo = new Rectangulo(20,30);
        System.out.println(otroCirculo);
        System.out.println(otroRectangulo);
    }
    
}
