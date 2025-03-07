import java.util.Scanner;
public class exe06{
    /*Um restaurante cobra R$ 25,00 por cada quilo de refeição.
     Escreva um programa que leia o peso do prato montado pelo 
     cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas. */
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Peso do seu prato:");
        Double kiloGrams = leitor.nextDouble();

        double realPeso = kiloGrams - 0.750;

        double price = realPeso*25;

        System.out.printf("O preço do seu preto é: R$ %.2f",price);
        leitor.close();
    }
}
