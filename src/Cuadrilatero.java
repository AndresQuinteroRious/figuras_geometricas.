public class Cuadrilatero extends Poligono{

    public Cuadrilatero(int idFigura, String color) {
        super(idFigura, color, 4);
    }
@Override 
    public double calcularArea() { 
        // Área genérica no definida 
        return 0; 
    } 
  
    @Override 
    public double calcularPerimetro() { 
        // Perímetro genérico no definido 
        return 0; 
   } 

}
