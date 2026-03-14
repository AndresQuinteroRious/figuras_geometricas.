public class App {
    public static void main(String[] args) throws Exception {
                Circulo c = new Circulo(1, 5, "Rojo"); 
        System.out.println("Área círculo: " + c.calcularArea()); 
        System.out.println("Perímetro círculo: " + c.calcularPerimetro()); 
  
        Rectangulo r = new Rectangulo(2, "Azul", 4, 6); 
        System.out.println("Área rectángulo: " + r.calcularArea()); 
        System.out.println("Perímetro rectángulo: " + r.calcularPerimetro()); 

        Triangulo t = new Triangulo(3, "Verde", 4, 5); 
        System.out.println("Área triángulo: " + t.calcularArea()); 
        System.out.println("Perímetro triángulo: " + t.calcularPerimetro()); 

        Rombo rombo = new Rombo(4, "Amarillo", 4, 6, 8); 
        System.out.println("Área rombo: " + rombo.calcularArea()); 
        System.out.println("Perímetro rombo: " + rombo.calcularPerimetro()); 

        Cuadrilatero cuadra = new Cuadrilatero(5, "Morado"); 
        System.out.println("Área cuadrilátero: " + cuadra.calcularArea()); 
        System.out.println("Perímetro cuadrilátero: " + cuadra.calcularPerimetro()); 

    }
}
