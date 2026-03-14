import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Figura> figuras = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menú de Figuras ---");
            System.out.println("1) Crear círculo");
            System.out.println("2) Crear rectángulo");
            System.out.println("3) Crear triángulo");
            System.out.println("4) Crear rombo");
            System.out.println("5) Crear cuadrado");
            System.out.println("6) Crear elipse");
            System.out.println("7) Mostrar todas las figuras");
            System.out.println("0) Salir");
            System.out.print("Elija una opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Opción inválida. Intente de nuevo.");
                continue;
            }

            if (opcion == 0) {
                System.out.println("Saliendo...");
                break;
            }

            switch (opcion) {
                case 1: // Circulo
                    System.out.print("Radio: ");
                    double radio = leerDouble(sc);
                    System.out.print("Id : ");
                    int idC = leerInt(sc);
                    System.out.print("Color: ");
                    String colorC = sc.nextLine();
                    // constructor: Circulo(double radio, int idFigura, String color)
                    Circulo c = new Circulo(radio, idC, colorC);
                    figuras.add(c);
                    mostrarFigura(c);
                    break;

                case 2: // Rectangulo
                    System.out.print("Base: ");
                    double base = leerDouble(sc);
                    System.out.print("Altura: ");
                    double altura = leerDouble(sc);
                    System.out.print("Id : ");
                    int idR = leerInt(sc);
                    System.out.print("Color: ");
                    String colorR = sc.nextLine();
                    Rectangulo r = new Rectangulo(idR, colorR, base, altura);
                    figuras.add(r);
                    mostrarFigura(r);
                    break;

                case 3: // Triangulo
                    System.out.print("Base: ");
                    double baseT = leerDouble(sc);
                    System.out.print("Altura: ");
                    double alturaT = leerDouble(sc);
                    System.out.print("Id : ");
                    int idT = leerInt(sc);
                    System.out.print("Color: ");
                    String colorT = sc.nextLine();
                    Triangulo t = new Triangulo(idT, colorT, baseT, alturaT);
                    figuras.add(t);
                    mostrarFigura(t);
                    break;

                case 4: // Rombo
                    System.out.print("Diagonal mayor: ");
                    double dMay = leerDouble(sc);
                    System.out.print("Diagonal menor: ");
                    double dMen = leerDouble(sc);
                    System.out.print("Id : ");
                    int idRo = leerInt(sc);
                    System.out.print("Color: ");
                    String colorRo = sc.nextLine();
                    // constructor: Rombo(int idFigura, String color, int numeroLados, double diagonalMayor, double diagonalMenor)
                    Rombo rombo = new Rombo(idRo, colorRo, 4, dMay, dMen);
                    figuras.add(rombo);
                    mostrarFigura(rombo);
                    break;

                case 5: // Cuadrado
                    System.out.print("Lado: ");
                    double lado = leerDouble(sc);
                    System.out.print("Id : ");
                    int idCu = leerInt(sc);
                    System.out.print("Color: ");
                    String colorCu = sc.nextLine();
                    // constructor: Cuadrado(int idFigura, String color, int numeroLados, double lado)
                    Cuadrado cuadrado = new Cuadrado(idCu, colorCu, 4, lado);
                    figuras.add(cuadrado);
                    mostrarFigura(cuadrado);
                    break;

                case 6: // Elipse
                    System.out.print("Eje mayor: ");
                    double ejeM = leerDouble(sc);
                    System.out.print("Eje menor: ");
                    double ejem = leerDouble(sc);
                    System.out.print("Id : ");
                    int idE = leerInt(sc);
                    System.out.print("Color: ");
                    String colorE = sc.nextLine();
                    Elipse elipse = new Elipse(idE, colorE, ejeM, ejem);
                    figuras.add(elipse);
                    mostrarFigura(elipse);
                    break;

                case 7: // Mostrar todas
                    if (figuras.isEmpty()) {
                        System.out.println("No hay figuras creadas aún.");
                    } else {
                        System.out.println("\n--- Listado de figuras ---");
                        for (Figura f : figuras) {
                            mostrarFigura(f);
                        }
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }

    private static int leerInt(Scanner sc) {
        while (true) {
            try {
                String line = sc.nextLine();
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un entero: ");
            }
        }
    }

    private static double leerDouble(Scanner sc) {
        while (true) {
            try {
                String line = sc.nextLine();
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Entrada inválida. Ingrese un número: ");
            }
        }
    }

    private static void mostrarFigura(Figura f) {
        System.out.println("\nFigura: " + f.getClass().getSimpleName());
        System.out.println("Id: " + f.getIdFigura());
        System.out.println("Color: " + f.getColor());
    System.out.println("Área: " + String.format("%.2f", f.calcularArea()));
    System.out.println("Perímetro: " + String.format("%.2f", f.calcularPerimetro()));
    }
}
