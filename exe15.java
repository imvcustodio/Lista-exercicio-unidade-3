import java.util.Scanner;

public class exe15 {
    /*
     * entrada: num
     * Processo: int cent = num / 100;
        int restCentena = num % 100
        int dezena = restCentena / 10;
        int restDezena = restCentena % 10;
        int unit = restDezena;
     * 
     * saida: cent,dezena,unit
     * teste:
        Digite um numero de ate 3 digitos
        234
        O numero 234, separado em Centenas:2, Dezenas:3, Unidades:4

        teste 2:
        Digite um numero de ate 3 digitos
        786
        O numero 786, separado em Centenas:7, Dezenas:8 Unidades:6
     */
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um numero de ate 3 digitos");
        int num = leitor.nextInt();

        int cent = num / 100;// pega qndts centenas tem
        int restCentena = num % 100;// aq guarda o resto da divisao por ex: 999/100 = 9 centenas, porem o resto 99
                                    // fica guardado nessa var

        int dezena = restCentena / 10;// pega o resto 99 e divide por 10 pra saber unidades 99/10 = 9
        int restDezena = restCentena % 10;// nessa ele pega o resto do 99 que n deu pra armazenar na de cima e guarda no
                                          // caso 99/10 = 9 resto 9

        int unit = restDezena;// aqui ele so pega o resto que e menor doq 10 ent ele guada nas unidades

        System.out.printf("O numero %d, separado em Centenas:%d, Dezenas:%d, Unidades:%d ", num, cent, dezena, unit);

        leitor.close();
    }
}
