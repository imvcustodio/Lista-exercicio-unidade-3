import java.util.Scanner;
public class exe05 {
    /*entrada: frangos 
     *Processo: valorFrangos = frangos * 11
      saida: valorFrangos

      teste: frangos = 15
            valorFrangos = 15 * 11
            saida: 165

     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("quantos frangos possuem na granja: ");
        int frangos = leitor.nextInt();

        double valorFrangos = frangos * 11;

        System.out.printf("O valor para identificar %d Frangos é R$ %.2f",frangos,valorFrangos);
        leitor.close();
    }
}