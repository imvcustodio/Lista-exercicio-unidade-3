
import java.util.Scanner;
public class exe01 {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite a Largura do terreno");
       int Largura = leitor.nextInt();
       System.out.println("Digite o Comprimento do terreno");
       int comprimento = leitor.nextInt();

       int metrosquad = Largura*comprimento;
    
       System.out.printf("A metragem quadrada do terreno é: %d ", metrosquad);
       leitor.close(); 
    }
}
