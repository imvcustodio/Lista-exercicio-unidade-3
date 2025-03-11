
import java.util.Scanner;

public class exe12 {
              /*entrada: name, work, depend
     *Processo: 
        int salarioWork = work*10;

        int dependentsSalari = depend * 60;

        int bruteSalari = salarioWork + dependentsSalari;

        double liquidSalariWork = bruteSalari *(1- 0.135);
      
        Saida:name , bruteSalari e liquidSalariWork

      teste: Informe o seu nome: isac
                Informe a sua carga horaria de trabalho mensais: 100
                Informe a sua quantidade de dependentes: 2
                Ola, isac
                Entao recebera Bruto: R$:1120
                Porem com descontos de INSS e imposto de renda: R$:968,80
                E esse foi nosso calculo, Tchau!
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o seu nome: ");
        String name = scanner.nextLine();
        
        System.out.print("Informe a sua carga horaria de trabalho mensais: ");
        int work = scanner.nextInt();
        
        System.out.print("Informe a sua quantidade de dependentes: ");
        int depend = scanner.nextInt();


        int salarioWork = work*10;

        int dependentsSalari = depend * 60;

        int bruteSalari = salarioWork + dependentsSalari;

        double liquidSalariWork = bruteSalari *(1- 0.135);

        System.out.printf("Ola, "+ name+"%n");
        System.out.printf("Você trabalhou %d horas%n", work); // funciona assim a concatenação dentro do java ao inves de usarmos o mais citamos a var no dfim e utilizamos o %d para int e o %.2f para floe para infdicar a variavel dentro da string de result

        System.out.printf("Entao seu salario foi por horas trabalhadas foi: %d%n",+ salarioWork);
        System.out.printf("Voce possui: %d dependentes%n",depend);
        System.out.printf("Entao recebera: %d Para ajudar com seus dependentes%n",dependentsSalari);
        
        System.out.printf("Entao recebera Bruto: R$:%d%n", bruteSalari);
        System.out.printf("Porem com descontos de INSS e imposto de renda: R$:%.2f%n",+ liquidSalariWork);
        System.out.printf("E esse foi nosso calculo, Tchau!");


        scanner.close();
    }
}