package sistema;

/**
 *
 * @author Sebas
 */
public class Rectangulo implements CalculosFormas{
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

//Área rectángulo: base * altura 
    @Override
    public double area() {
        return base*altura;
    }
// Perímetro rectángulo: (base + altura) * 2
    @Override
    public double perimetro() {
        return (base+altura)*2;
    }
    
    @Override
    public String toString() {
        return String.format("Rectangulo{base= %.2f | altura= %.2f | area= %.2f | perimetro= %.2f }",base,altura,area(),perimetro());
    }
}
