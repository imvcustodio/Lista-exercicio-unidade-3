import java.util.Scanner;
public class exe16 {
    /*entrada: totalCompra,totalCliente
     Processo:          int troco = totalCliente-totalCompra;
                        int trocoT = troco;
                        int nota100 = trocoT/100; 
                        trocoT = trocoT % 100; 
                        notasT = nota100;
                        int nota10 = trocoT/10;
                        trocoT = trocoT % 10;
                        notasT += nota10;
                        int moeda1 = trocoT;
                        notasT +=moeda1;
     Saida:notasT,troco,nota100,nota10,moeda1
     teste: Valor total da compra: 
            254
            Valor total dado pelo cliente:
            300
            o minimo de notas que compoem o troco é 10
            o troco deu 46 e e compoto por 0 Notas de 100, 4 Notas de 10 e 6 moedas de 1

      teste 2: Valor total da compra: 
            1400
            Valor total dado pelo cliente:
            1650
            o minimo de notas que compoem o troco é 7
            o troco deu 250 e e compoto por 2 Notas de 100, 5 Notas de 10 e 0 moedas de 1
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor total da compra: ");
        int totalCompra = leitor.nextInt();
        int notasT = 0;
        System.out.println("Valor total dado pelo cliente: ");
        int totalCliente = leitor.nextInt();

        int troco = totalCliente-totalCompra;
        int trocoT = troco;

        int nota100 = trocoT/100; 
        trocoT = trocoT % 100; // o erro que tava dando e que ao inves de eu usar o trocoT para armazenmar o resto eu tava pengando o nota100
                            // no caso trocoT=nota100%100, no caso iria dar 0 sempre pq o nota100 so pega valor inteiro.
        notasT = nota100;
        int nota10 = trocoT/10;
        trocoT = trocoT % 10;
        notasT += nota10;

        int moeda1 = trocoT;
        notasT +=moeda1;
        
        
        System.out.printf("o minimo de notas que compoem o troco é %d%n ",notasT);


        System.out.printf("o troco deu %d e e compoto por %d Notas de 100, %d Notas de 10 e %d moedas de 1",troco,nota100,nota10,moeda1);

        leitor.close();
    }
}
