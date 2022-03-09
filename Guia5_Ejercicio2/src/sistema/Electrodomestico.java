package sistema;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Electrodomestico {
    //precio, color, consumo energético (letras entre A y F) y peso.
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio = precio;
        comprobarColor(color);
        comprobarConsumoElectrico(consumoEnergetico);
        this.peso = peso;
        //precioFinal();
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    /*
    Método comprobarConsumoEnergetico(char letra): comprueba que la letra 
    es correcta, sino es correcta usara la letra F por defecto. Este método se debe 
    invocar al crear el objeto y no será visible.
    */
    protected void comprobarConsumoElectrico(char letra){
        
        if (letra=='a' || letra=='b' || letra=='c' || letra=='d' || letra=='e' || letra=='f'){
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = 'f';
        }            
    }
    
    /*
    Método comprobarColor(String color): comprueba que el color es correcto, y 
    si no lo es, usa el color blanco por defecto. Los colores disponibles para los 
    electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre 
    está en mayúsculas o en minúsculas. Este método se invocará al crear el 
    objeto y no será visible.
    */
    protected void comprobarColor(String color){
        switch (color.toUpperCase()) {
            case "BLANCO":
                this.color = color;
                break;
            case "NEGRO":
                this.color = color;
                break;
            case "ROJO":
                this.color = color;
                break;
            case "AZUL":
                this.color = color;
                break;
            case "GRIS":
                this.color = color;
                break;
            default:
                this.color = "BLANCO";
        }
        
        
    }
    /*
    Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
    electrodoméstico, también llama los métodos para comprobar el color y el 
    consumo. Al precio se le da un valor base de $1000.
    */
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        //precio, color, consumo energético (letras entre A y F) y peso.
        System.out.print("Ingrese el color: ");
        String color = leer.next();
        System.out.print("Ingrese el peso: ");
        double peso = leer.nextDouble();
        System.out.print("Ingrese el consumo energético: ");
        char consumo = leer.next().charAt(0);
        System.out.println("Se asigna un valor base de 1000");
        comprobarColor(color);
        comprobarConsumoElectrico(consumo);
        this.peso = peso;
        this.precio = 1000;
        precioFinal();
    }
    /* Método precioFinal(): según el consumo energético y su tamaño, aumentará 
    el valor del precio. Esta es la lista de precios: 
    a=1000, b=800, c=600, d=400, e=300, f=100.
    1y19= 100, 20y49=500, 50y79=800, +80= 1000. */
    protected void precioFinal(){

        switch (consumoEnergetico){
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
                this.precio += 300;
                break;
            default:
                this.precio += 100;
                break;
        }
        if (this.peso<20 && this.peso>0){
            this.precio += 100;
        }
        if (this.peso<50 && this.peso>=20){
            this.precio += 500;
        }
        if (this.peso<80 && this.peso>=50){
            this.precio += 800;
        }
        if (this.peso>=80){
            this.precio += 1000;
        }
        
    }

    @Override
    public String toString() {
        return String.format("Electrodomestico: Precio: %.3f", this.precio);
    }
    
    
    
}
