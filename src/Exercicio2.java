import java.util.Scanner;

public class Exercicio2 {

    //Faça um algoritmo que leia uma variável e some 5 caso seja par
    // ou some 8 caso seja ímpar, imprimir o resultado desta operação.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultado;

        if (numero % 2 == 0) {
            resultado = numero + 5;
        } else {
            resultado = numero + 8;
        }

        System.out.println("Aqui esta o resultado da operação é: " + resultado);
    }
}
