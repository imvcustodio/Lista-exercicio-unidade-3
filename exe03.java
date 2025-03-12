
import java.util.Scanner;
public class exe03 {
            /*Entrada: price e pay
     * processo: gasol = pay/price // saber quanto dava em litros o valor que o motorista deseja colocar
     * saida: gasol
     * teste: price = 6
     *        pay = 60
     *        gasol = 60/6 = 10 Litros de gasolina
     
     * teste 2 : price = 6
     *        pay = 300
     *        gasol = 300/6 = 50 Litros de gasolina
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("qual o preço do Litro da gasol: ");
        double price = leitor.nextDouble();

        System.out.print("quantos Reais voce quer colocar: R$ ");
        double pay = leitor.nextDouble();

        double gasol = pay/price;
        
        System.out.printf("O motorista conseguiu colocar : %.2f Litros de Gasolina",gasol);

      
        leitor.close();
    }
} 
