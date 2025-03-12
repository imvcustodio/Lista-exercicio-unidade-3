
import java.util.Scanner;
public class exe01 {
    /*Entrada:larguraTerreno e comprimentoTerreno
     * processo: metrosQuadrados = larguraTerreno*comprimentoTerreno
     * saida: metrosQuadrados
     * teste: larguraTerreno = 4 
     *        comprimentoTerreno = 10
     *        metrosQuadrados = 4*10
     *        metrosQuadrados = 40
      teste 2:       
              larguraTerreno = 10
     *        comprimentoTerreno = 100
     *        metrosQuadrados = 10*100
     *        metrosQuadrados = 1000
     */
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
