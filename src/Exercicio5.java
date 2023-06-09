import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = 20;
        int numerosEntreZeroECem = 0;

        System.out.println("Digite " + quantidadeNumeros + " números:");

        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                numerosEntreZeroECem++;
            }
        }

        System.out.println("A quantidade de números entre 0 e 100 é: " + numerosEntreZeroECem);
    }
}
