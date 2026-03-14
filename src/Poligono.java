public abstract class Poligono extends Figura {

    protected int numeroLados;

    public Poligono(int idFigura, String color, int numeroLados) {
        super(idFigura, color);
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    public void setNumeroLados(int numeroLados) {
        this.numeroLados = numeroLados;
    } 
    
}
