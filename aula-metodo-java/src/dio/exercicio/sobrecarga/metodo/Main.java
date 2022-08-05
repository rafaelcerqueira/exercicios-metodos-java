package dio.exercicio.sobrecarga.metodo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercício quadrilátero");
        //quadrado
        Quadrilatero.area(2);
        //retângulo
        Quadrilatero.area(4, 4);
        //trapézio
        Quadrilatero.area(8, 3, 7);
    }
}
