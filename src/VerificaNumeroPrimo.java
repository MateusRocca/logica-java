import java.util.Scanner;

public class VerificaNumeroPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        boolean encontrouDivisor = false;
        System.out.println("Verificador de números primos.\nInsira um número para realizar a verificação:");
        numero = scan.nextInt();

        if (numero <= 1){
            System.out.println("Não é primo!");
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    encontrouDivisor = true;
                    break;
                }
            }
        }

        if (!encontrouDivisor) {
            System.out.println("Número é primo!");
        } else {
            System.out.println("Número não é primo!");
        }







    }
}
