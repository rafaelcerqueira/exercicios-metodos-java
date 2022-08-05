package dio.exercicio.sobrecarga.metodo;

//Sobrecarga métodos:
public class Quadrilatero {
    public static void area(double lado) {
        double quadrado = lado * lado;
        System.out.println("Área do quadrado: " + quadrado);
    }

    public static void area(double lado1, double lado2) {
        double retangulo = lado1 * lado2;

        System.out.println("Área do retângulo: " + retangulo);

    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        double trapezio = ((baseMaior + baseMenor) * altura) / 2;

        System.out.println("Ára do trapézio " + trapezio);
    }

}
