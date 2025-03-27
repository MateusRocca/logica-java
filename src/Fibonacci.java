import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira a quantidade de termos da sequência: ");
        int n = scan.nextInt();

        long primeiro = 0, segundo = 1;

        System.out.println("Sequência Fibonacci: ");

        if (n >= 1) {
            System.out.println(primeiro); // Imprime o primeiro termo
        }
        if (n >= 2) {
            System.out.println(segundo); // Imprime o segundo termo
        }

        // Para os termos subsequentes
        for (int i = 2; i < n; i++) {
            long proximo = primeiro + segundo;
            System.out.println(proximo);
            primeiro = segundo;
            segundo = proximo;
        }

        scan.close();


    }
}
