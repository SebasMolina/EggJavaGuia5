package sistema;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
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
    @Override
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        super.crearElectrodomestico();
        System.out.print("Ingrese el peso de la carga: ");
        this.carga = leer.nextInt();
        this.precioFinal();
    }
    
    @Override
    public void precioFinal(){
        //super.precioFinal();
        if(this.carga>30){
            this.precio +=500;
        }
    }

    @Override
    public String toString() {
        return String.format("Lavadora: Precio: %.3f", this.precio);
    }
    
}
