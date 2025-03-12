import java.util.Scanner;

public class exe08 {
      /*entrada: dols
     *Processo: real = dols*5.80
      saida: real
      teste: dols = 2
             real = 2*5.80
             real = 11,60

      teste 2 : dols = 100
             real = 100*5.80
             real = 580
     */
      public static void main(String[] args) {//atributo para colocar a classe main q e necessario
        
    
        Scanner scanner = new Scanner(System.in); // adicionar o atributo Scanner para ler variaveis sendonecessario fechar ao fim da MAIN

        
        System.out.print("Informe seu valor em dolares: ");
        double dols = scanner.nextDouble();
        

        double real= dols*5.80;



        System.out.printf("Você entregou $ %.2f Dollares, entao pode tirar R$ %.2f",dols,real);

        scanner.close();
    }
}
