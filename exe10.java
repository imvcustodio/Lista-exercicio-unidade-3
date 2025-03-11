package exe10;

import java.util.Scanner;

public class exe10 {
      /*entrada: catetoAdjacente e catetoOposto
     *Processo: hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2)+ Math.pow(catetoOposto, 2));
      Saida:hipotenusa

      teste: catetoAdjacente = 2
             catetoOposto = 2
             hipotenusa = Math.sqrt(Math.pow(2, 2)+ Math.pow(2, 2));
             saida: 2,83
     */
      public static void main(String[] args) {//atributo para colocar a classe main q e necessario
        
    
        Scanner scanner = new Scanner(System.in); // adicionar o atributo Scanner para ler variaveis sendonecessario fechar ao fim da MAIN

        
        System.out.print("Informe o valor do cateto adjacente: ");
        Double catetoAdjacente = scanner.nextDouble();

        System.out.print("Informe o valor do cateto oposto: ");
        Double catetoOposto = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoAdjacente, 2)+ Math.pow(catetoOposto, 2));

        System.out.printf("O volume da hipotenusa é: %.2f ",hipotenusa);

        scanner.close();
    }
}