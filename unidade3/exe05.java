import java.util.Scanner;
public class exe05 {
    /*Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um anel com um chip de identificação; 
    no pé esquerdo são dois anéis para indicar o tipo de alimento que ele deve consumir.
     Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50, faça um programa para calcular o gasto total da granja para marcar todos os seus frangos. */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("quantos frangos possuem na granja: ");
        int frangos = leitor.nextInt();

        double valorFrangos = frangos * 11;

        System.out.printf("O valor para identificar %d Frangos é R$ %.2f",frangos,valorFrangos);
        leitor.close();
    }
}
