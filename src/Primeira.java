import java.util.InputMismatchException;
import java.util.Scanner;

public class Primeira {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner ent = new Scanner(System.in);
    
        System.out.print("\nQuantos valores serão operados?\n");
        int tamanho = getIntNumber(ent);
        System.out.printf("\nSerão operados %s valores.\n", tamanho);
        
        int[] valores = new int[tamanho];
        
        for (int i = 0; i < valores.length; i++) {
            int j = i + 1;
            System.out.println("\nQual é o " + j + "° valor?");
            valores[i] = getIntNumber(ent);
        }
        
        double media = calculaMedia(valores);
        System.out.println("\nA média dos " + tamanho + " valores é " + media);
        System.out.println("\nGoodbye cruel world!");
    }
    
    private static double calculaMedia(int[] valores){
        double soma = 0;
        for (int a : valores) soma += a;
        return soma / valores.length;
    }
    static int getIntNumber(Scanner input) {
        try {
            System.out.print("Digite um número inteiro: ");
            return input.nextInt();
        } catch (InputMismatchException e) {
            System.out.print("\nO número digitado não é inteiro!\n");
            input.nextLine();
            //e.printStackTrace();
            return getIntNumber(input);
        }
    }
}