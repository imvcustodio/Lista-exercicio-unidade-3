
import java.util.Scanner;
public class exe02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("qual o preço do calçado: ");
        double price = leitor.nextDouble();

        double desconto = price * 0.12;
        System.out.printf("o valor do desconto é : %.2f\n",desconto);

        double finalPrince = price - desconto;

        System.out.printf("O preço final do calçado é : R$ %.2f", finalPrince);
        leitor.close();
    }
} 
