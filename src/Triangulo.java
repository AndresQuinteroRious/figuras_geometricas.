public class Triangulo extends Poligono {

    private double base;
    private double altura;

    public Triangulo(int idFigura, String color, double base, double altura) {
        super(idFigura, color, 3);
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

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return base + 2 * Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
    }

}
