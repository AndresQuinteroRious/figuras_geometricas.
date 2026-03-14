public abstract class Figura {
    
    protected int idFigura; 
    protected String color;
    public int getIdFigura() {
        return idFigura;
    }
    public Figura(int idFigura, String color) {
        this.idFigura = idFigura;
        this.color = color;
    }
    public void setIdFigura(int idFigura) {
        this.idFigura = idFigura;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    } 
        public abstract double calcularArea(); 
    public abstract double calcularPerimetro(); 


    
}
