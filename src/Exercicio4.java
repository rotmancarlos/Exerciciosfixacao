import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPessoas = 20;
        int somaIdades = 0;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }

        double media = (double) somaIdades / totalPessoas;
        System.out.println("A média das idades é: " + media);

        scanner.close();
    }
}
