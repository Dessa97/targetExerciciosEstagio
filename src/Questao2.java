import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao2 {
    /*
    Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma
    dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa
    na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e
    retorne uma mensagem avisando se o número informado pertence ou não a sequência.
    IMPORTANTE:
    Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente
    definido no código;
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja saber se está na sequência de Fibonnaci");
        int numero = 0;
        while (true) { // Loop infinito, que será interrompido quando um número válido for inserido
            System.out.print("Digite um número inteiro: ");
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt(); // Atribui o input para a variável 'numero'
                break; // Sai do loop se um número válido for fornecido
            } else {
                System.out.println("Você não digitou um número inteiro válido. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner para evitar um loop infinito
            }
        }

        System.out.println("O número digitado foi: " + numero);

        scanner.close();

        if(estaNaSequenciaFibonnaci(numero)){
            System.out.println("O numero está na Sequencia Fibonnaci");
        }else{
            System.out.println("O numero não esta na Sequencia Fibonnaci");
        }

    }

    private static Boolean estaNaSequenciaFibonnaci(int numero){
        int a = 0;
        int b = 1;

        while (b < numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == numero;
    }
}
