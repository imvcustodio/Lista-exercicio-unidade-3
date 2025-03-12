
import java.util.Scanner;
public class exe02 {
        /*Entrada: price
     * processo: desconto = price*0.12 e finalPrice = price - desconto;// para calcular o valor do desconto de 12%
     * saida: desconto e finalPrice
     * teste: price = 100
     *        desconto = 100*0.12 = 12
     *        fianlprice = 100 - 12 = 88
       teste 2: price = 400
     *        desconto = 400*0.12 = 48
     *        fianlprice = 400 - 48 = 352
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("qual o preço do calçado: ");
        double price = leitor.nextDouble();

        double desconto = price * 0.12;
        System.out.printf("o valor do desconto é : %.2f\n",desconto);

        double finalPrice = price - desconto;

        System.out.printf("O preço final do calçado é : R$ %.2f", finalPrice);
        leitor.close();
    }
} 
