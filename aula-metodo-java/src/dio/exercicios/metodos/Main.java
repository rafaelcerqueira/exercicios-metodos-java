package dio.exercicios.metodos;

public class Main {
    public static void main(String[] args) {

        //Calculadora:
        System.out.println("Exercício calculadora");
        Calculadora.somar(2, 3);
        Calculadora.subtrair(10, 4);
        Calculadora.multiplicar(3, 4);
        Calculadora.dividir(20, 4);

        //Mensagem:
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);

    }
}
