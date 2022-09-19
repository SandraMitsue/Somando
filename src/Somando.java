//Programa de adição, inserindo dois números e depois somando-os
// utilizando a classe scanner
import java.util.Scanner;

public class Somando {
    //método main inicia a execução java
    public static void main(String[] args)
    {
        // cria um scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        
        // Adição das variáveis
        int numero1;
        int numero2;
        int soma;

        System.out.print("Entre com o primeiro número: ");
        numero1 = input.nextInt();

        System.out.print("Entre com o segundo número: ");
        numero2 = input.nextInt();

        soma = numero1 + numero2;

        System.out.printf("A soma é %d%n", soma);
        
    }  //fim do método main
} //fim da classe Somando
