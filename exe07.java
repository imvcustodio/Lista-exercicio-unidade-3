import java.util.Scanner;
public class exe07 {
       
    /*entrada: lata350,  lata600 e garrafa2L
     *Processo: litragemTotal = (lata350*0.350) + (lata600*0.600)+ (garrafa2L*2);
      Saida:litragemTotal
            teste: lata350 = 1 ,  lata600= 1 e garrafa2L=2
            litragemTotal = (1*0.350) + (1*0.600)+ (2*2);
            litragemTotal = 4,95
     */
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
    
  
