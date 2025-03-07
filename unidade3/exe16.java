import java.util.Scanner;
public class exe16 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor total da compra: ");
        int totalCompra = leitor.nextInt();

        System.out.println("Valor total dado pelo cliente: ");
        int totalClente = leitor.nextInt();

        int troco = totalClente-totalCompra;
        int trocoT = troco;
        int nota100 = trocoT/100;
        trocoT = nota100%100;
        
        int nota10 = trocoT/10;
        trocoT = nota10%10;

        int moeda1 = trocoT;
        
        
       

        System.out.printf("o troco deu %d e e compoto por %d Notas de 100, %d Notas de 10 e %d moedas de 1 ",troco,nota100,nota10,moeda1);

        leitor.close();
    }
}
