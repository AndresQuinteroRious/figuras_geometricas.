public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, int idFigura, String color) {
        super(idFigura, color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    @Override 
    public double calcularArea() { 
        return Math.PI * radio * radio; 
    } 
  
    @Override 
    public double calcularPerimetro() { 
        return 2 * Math.PI * radio; 
    } 

}