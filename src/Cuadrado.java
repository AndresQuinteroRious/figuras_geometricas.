public class Cuadrado extends Poligono{
        private double lado;

        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

        public Cuadrado(int idFigura, String color, int numeroLados, double lado) {
            super(idFigura, color, numeroLados);
            this.lado = lado;
        } 
            @Override 
    public double calcularArea() { 
        return lado * lado; 
    } 
  
    @Override 
    public double calcularPerimetro() { 
        return 4 * lado; 
    } 

  

}
