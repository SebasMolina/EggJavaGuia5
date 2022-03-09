package sistema;

/**
 *
 * @author Sebas
 */
public class Circulo implements CalculosFormas{

    private double diametro;

    public Circulo(double diametro) {
        this.diametro = diametro;
    }

    public Circulo() {
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
/// Área circulo: PI * radio ^ 2     
    @Override
    public double area() {
        double radio = this.diametro/2;
        return (CalculosFormas.PI * Math.pow(radio, 2));
    }
/// Perímetro circulo: PI * diámetro.
    @Override
    public double perimetro() {
        return (CalculosFormas.PI * this.diametro);
    }

    @Override
    public String toString() {
        return String.format("Circulo{diametro= %.3f | area= %.3f | perimetro= %.3f}",diametro,area(),perimetro());
    }
    
}
