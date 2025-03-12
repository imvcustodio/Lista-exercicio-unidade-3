package exe13.src;

import java.util.Scanner;

public class exe13 {
              /*entrada: comprimento e altura
                *Processo: 
                double metroQuadradoParede = (comprimento*altura);

                double metroQuadradoAzulejo = (9*12.5);

                double price = (metroQuadradoAzulejo*metroQuadradoParede);
                saida: price
      teste: 
                Quantos metros tem de comprimento a sua parede: 10
                Quantos metros tem de altura a sua parede: 3
                O preço de azuleijos para a quantidade necessaria para sua parece é: R$ 3375,00
      
      teste 2: 
                Quantos metros tem de comprimento a sua parede: 2
                Quantos metros tem de altura a sua parede: 2,5
                O preço de azuleijos para a quantidade necessaria para sua parece é: R$ 562,5
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos metros tem de comprimento a sua parede: ");
        double comprimento= scanner.nextDouble();

        System.out.print("Quantos metros tem de altura a sua parede: ");
        double altura= scanner.nextDouble();

        double metroQuadradoParede = (comprimento*altura);

        double metroQuadradoAzulejo = (9*12.5);

        double price = (metroQuadradoAzulejo*metroQuadradoParede);

        System.out.printf("O preço de azuleijos para a quantidade necessaria para sua parece é: R$ %.2f",price);

        

        scanner.close();
    }
}
