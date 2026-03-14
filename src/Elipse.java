public class Elipse extends Figura{
    
        private double ejeMayor; 
    private double ejeMenor;
    public double getEjeMayor() {
        return ejeMayor;
    }
    public void setEjeMayor(double ejeMayor) {
        this.ejeMayor = ejeMayor;
    }
    public double getEjeMenor() {
        return ejeMenor;
    }
    public void setEjeMenor(double ejeMenor) {
        this.ejeMenor = ejeMenor;
    }
    public Elipse(int idFigura, String color, double ejeMayor, double ejeMenor) {
        super(idFigura, color);
        this.ejeMayor = ejeMayor;
        this.ejeMenor = ejeMenor;
    } 
    @Override 
    public double calcularArea() { 
        return Math.PI * ejeMayor * ejeMenor; 
    } 
  
    @Override 
    public double calcularPerimetro() { 
        // Aproximación de Ramanujan 
        return Math.PI * (3*(ejeMayor+ejeMenor) - Math.sqrt((3*ejeMayor+ejeMenor)*(ejeMayor+3*ejeMenor))); 
    } 


}
