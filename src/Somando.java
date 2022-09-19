import java.util.Scanner;

public class Somando {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
        int soma;

        System.out.print("Entre com o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Entre com o segundo número: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.printf("A soma é %d%n", soma);




    }
}
