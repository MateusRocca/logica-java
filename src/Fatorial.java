import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int fatorial = 0;
        System.out.println("Insira o número:");
        numero = scan.nextInt();

        for (int i = numero - 1; i > 0; i--) {
            fatorial = numero *= i;
        }
        System.out.println(fatorial);
    }
}
