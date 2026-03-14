public class Punto {
    private double x;
    private double y;
    public double getX() {
        return x;
    }
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void mover(double nuevoX, double nuevoY) { 
        this.x = nuevoX; 
        this.y = nuevoY; 
    } 

}
    
