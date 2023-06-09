import java.util.Scanner;

public class Exercicio1 {

    // Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais deverá se somar os dois,
    // caso contrário multiplique A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado
    // para uma variável C e mostrar seu conteúdo na tela.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o valor de A: ");
            int a = scanner.nextInt();

            System.out.print("Digite o valor de B: ");
            int b = scanner.nextInt();

            int c;

            if (a == b) {
                c = a + b;
            } else {
                c = a * b;
            }

            System.out.println("O valor de C é: " + c);
        }
}
