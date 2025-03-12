
import java.util.Scanner;
public class exe11 {
          /*entrada: celcius
     *Processo: farenheit = celcius*(1.8)+32;
      Saida:farenheit

      teste: celcius = 30
             farenheit = 30*(1.8)+32;
             saida: 86
      
      teste 2: celcius = 10
             farenheit = 10*(1.8)+32;
             saida: 50
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva a temperatura que deseja converter de celcius para farenheit: ");
        double celcius = leitor.nextDouble();

        double farenheit = celcius*(1.8)+32;

        System.out.printf("A temperatura: %.2f Celcius em Farenheit é: %.2f", celcius,farenheit);
        leitor.close();
    }
}
