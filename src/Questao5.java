public class Questao5 {
    /*
    5) Escreva um programa que inverta os caracteres de um string.

    IMPORTANTE:
    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse;
     */

    public static void main(String[] args) {
        String palavra = "Estagio";
        String palavraInvertida = inverterString(palavra);
        System.out.println("Palavra original: " + palavra);
        System.out.println("Palavra invertida: " + palavraInvertida);
    }

    private static String inverterString(String palavra) {
        char[] caracteres = palavra.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
