package sistema;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        super.crearElectrodomestico();
        System.out.print("Ingrese la resolucion: ");
        this.resolucion = leer.nextInt();
        System.out.print("Ingrese S si tiene sintonizador TDT, si no tiene ingrese N: ");
        if(leer.next().toUpperCase().charAt(0)=='S'){
            this.TDT = true;
        } else {
            this.TDT = false;
        }
        precioFinal();
    }
    
    /*
    Método precioFinal(): este método será heredado y se le sumará la siguiente 
    funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se 
    incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, 
    aumentará $500. Recuerda que las condiciones que hemos visto en la clase 
    Electrodomestico también deben afectar al precio.
    */
    @Override
    public void precioFinal(){
        //super.precioFinal();
        if(this.resolucion>=40){
            this.precio += (this.precio*1.3);
        }
        if(this.TDT){
            this.precio += 500;
        }
    }
    @Override
    public String toString() {
        return String.format("Televisor: Precio: %.3f", this.precio);
    }
}
