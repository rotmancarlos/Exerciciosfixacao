import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;

        System.out.println("Digite uma sequência de números (digite um número negativo para encerrar):");

        while (true) {
            numero = scanner.nextInt();

            if (numero < 0) {
                break;
            }

            soma += numero;
        }

        System.out.println("A soma dos números digitados é: " + soma);
    }

}
