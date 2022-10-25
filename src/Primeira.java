import java.nio.charset.Charset;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class Primeira {

    public static void main(String[] args) {
        System.setProperty("sun.jnu.encoding", "UTF-8");
        System.setProperty("file.encoding", "UTF-8");
        Locale.setDefault(new Locale("pt", "BR"));

        System.out.println("\nHello world!");

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
        System.out.println("\nGoodbye cruel world!\n");
        System.out.println("Default Locale:   " + Locale.getDefault());
        System.out.println("Default Charset:  " + Charset.defaultCharset());
        System.out.println("file.encoding:    " + System.getProperty("file.encoding"));
        System.out.println("sun.jnu.encoding: " + System.getProperty("sun.jnu.encoding"));
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