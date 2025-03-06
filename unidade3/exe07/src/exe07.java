import java.util.Scanner;
public class exe07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Quantos Latas de 350ML: ");
        double lata350 = leitor.nextDouble();
        System.out.print("Quantos Latas de 600ML: ");
        double lata600 = leitor.nextDouble();
        System.out.print("Quantos Latas de 2L: ");
        double garrafa2L = leitor.nextDouble();

        double litragemTotal = (lata350*0.350) + (lata600*0.600)+ (garrafa2L*2);

        System.out.printf("Foram comprados: %.2f Litros de Refrigerante ", litragemTotal);


        leitor.close();
    }
}
    
  
