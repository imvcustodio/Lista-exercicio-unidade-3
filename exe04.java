import java.util.Scanner;
public class exe04{
    /*
     *  Entrada de Dados:Nota1, Nota2 e Nota3
        Processo:mediaP(nota1×5)+(nota2×3)+(nota3×2)/(5+3+2)
​        Saída:mediaP
        Teste:
        Entrada: 9 6 8
        Saída: 7.90
        
        teste 2:
        entradas: 2 5 10
        saida:4.50
     */

//Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada (as notas tem pesos respectivos de 5, 3 e 2).
    public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);
        System.out.print("Digite 3 notas de um aluno com um espaço entre elas: ");
        double n1 = leitor.nextDouble();
        double n2 = leitor.nextDouble();
        double n3 = leitor.nextDouble();
        
        double nota1 = n1 *5;
        double nota2 = n2 *3;
        double nota3 = n3 *2;

        double mediaP = (nota1+nota2+nota3)/10;
        System.out.printf("A media ponderada é : %.2f", mediaP);
    leitor.close();
    }
}
