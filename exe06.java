import java.util.Scanner;
public class exe06{
    /*entrada: kiloGrams 
     *Processo: realPeso = kiloGrams - 0.750 // 0.750 e o 750 gramas do prato
                price= realPeso*25
      Saida:Price
      teste: kilograms = 1
             realPeso = 1 - 0.750
             price= 0.250 * 25
             price = 6,25
     */
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