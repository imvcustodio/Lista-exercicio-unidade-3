package exe09;

import java.util.Scanner;

public class exe09 {
    /*entrada: raio e altura
     *Processo: volume = 3.1416 * Math.pow(raio, 2) * altura;
      Saida:volume

      teste: raio = 2
             altura = 2
             volume = 3.1416 * Math.pow(2, 2) * 2;
             saida: 25,13
     */
      public static void main(String[] args) {//atributo para colocar a classe main q e necessario
        
    
        Scanner scanner = new Scanner(System.in); // adicionar o atributo Scanner para ler variaveis sendonecessario fechar ao fim da MAIN

        
        System.out.print("Informe o valor do raio da lata de oleo: ");
        Double raio = scanner.nextDouble();

        System.out.print("Informe o valor da altura da lata de oleo: ");
        Double altura = scanner.nextDouble();

        double volume = 3.1416 * Math.pow(raio, 2) * altura;

        System.out.printf("O volume da lata de sardinha é: %.2f ",volume);

        scanner.close();
    }
}