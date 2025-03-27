import java.util.Scanner;

public class InverterNumero {
    public static void main(String[] args) {
        //opção 1
        Scanner scan = new Scanner(System.in);
        int numero;
        int comprimento;
        int numInverso = 0;
        System.out.println("Insira o número: ");
        numero = scan.nextInt();
        comprimento = String.valueOf(numero).length();


        for (int i = 0; i < comprimento; i++) {
            numInverso = numInverso * 10 + (numero % 10);
            numero /= 10;
        }
        System.out.println(numInverso);
        scan.close();

        //opção 2

        while (numero != 0) {
            int digito = numero % 10;
            numInverso = numInverso * 10 + digito;
            numero /= 10;
        }

        //opção 3
        String invertido = new StringBuilder(String.valueOf(numero)).reverse().toString();
        numInverso = Integer.parseInt(invertido);
        System.out.println(numInverso);
    }
}
