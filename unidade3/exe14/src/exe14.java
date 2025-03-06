

import java.util.Scanner;

public class exe14 {
    /*Uni2Exe18 [2] Numa loja de materiais de construção, um azulejo estampado custa R$ 12,50. Leia o comprimento
     e altura de uma parede (em metros)
     e escreva o valor gasto com a compra de azulejos. Considere que um metro quadrado é formado por 9 azulejos.
     * 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos KM vc percorreu: ");
        double kiloMetros= scanner.nextDouble();

        System.out.print("Quantas horas voce demorou: ");
        double time= scanner.nextDouble();

        double veloMedia = (kiloMetros/time);

        double gasolGasta = (kiloMetros/12);

        System.out.printf("A velocidade media da viajem foi de %.2f KM/H, e a quantidade de combustivel utilizado foi %.2f Litros" ,veloMedia,gasolGasta);

        

        scanner.close();
    }
}