import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de identificação do aluno: ");
        int numeroIdentificacao = input.nextInt();

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = input.nextDouble();

        double mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicios) / 7;

        System.out.println("Número de identificação: " + numeroIdentificacao);
        System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        System.out.println("Média dos exercícios: " + mediaExercicios);
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);

        String conceito;
        if (mediaAproveitamento >= 90) {
            conceito = "A";
        } else if (mediaAproveitamento >= 75) {
            conceito = "B";
        } else if (mediaAproveitamento >= 60) {
            conceito = "C";
        } else if (mediaAproveitamento >= 40) {
            conceito = "D";
        } else {
            conceito = "E";
        }

        System.out.println("Conceito: " + conceito);

        if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }


}
