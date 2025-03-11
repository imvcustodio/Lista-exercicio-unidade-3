

import java.util.Scanner;

public class exe14 {
              /*entrada: kiloMetros e time
                *Processo: 
                    double veloMedia = (kiloMetros/time);

                    double gasolGasta = (kiloMetros/12);
                saida: veloMedia,gasolGasta
      teste: 
                Quantos KM vc percorreu: 100
                Quantas horas voce demorou: 2
                A velocidade media da viajem foi de 50,00 KM/H, e a quantidade de combustivel utilizado foi 8,33 Litros
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