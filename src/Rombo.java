public class Rombo extends Poligono{

    private double diagonalMayor; 
    private double diagonalMenor;
    public double getDiagonalMayor() {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor) {
        this.diagonalMayor = diagonalMayor;
    }
    public double getDiagonalMenor() {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor) {
        this.diagonalMenor = diagonalMenor;
    }
    public Rombo(int idFigura, String color, int numeroLados, double diagonalMayor, double diagonalMenor) {
        super(idFigura, color, numeroLados);
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
    } 
    @Override 
    public double calcularArea() { 
        return (diagonalMayor * diagonalMenor) / 2; 
    } 
  
    @Override 
    public double calcularPerimetro() { 
        // Aproximación: lados iguales 
        double lado = Math.sqrt(Math.pow(diagonalMayor/2, 2) + Math.pow(diagonalMenor/2, 2)); 
        return 4 * lado; 
    } 


}
