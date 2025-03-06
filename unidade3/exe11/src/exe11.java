
import java.util.Scanner;
public class exe11 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva a temperatura que deseja converter de celcius para farenheit: ");
        double celcius = leitor.nextDouble();

        double farenheit = celcius*(1.8)+32;

        System.out.printf("A temperatura: %.2f Celcius em Farenheit é: %.2f", celcius,farenheit);
        leitor.close();
    }
}
