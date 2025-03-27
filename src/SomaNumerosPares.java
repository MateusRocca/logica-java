import java.util.Scanner;

public class SomaNumerosPares {
    public static void main(String[] args) {
    //Exercício de lógica que some somente números pares
        Scanner scan = new Scanner(System.in);
        int numInicio = 0;
        int numFinal = 0;
        int soma = 0;
        System.out.println("A partir de qual número você quer começar a soma?");
        numInicio = scan.nextInt();
        System.out.println("Você quer somar até qual número?");
        numFinal = scan.nextInt();

        for (int i = 0; i < numFinal; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números pares é: " + soma);


    }
}
