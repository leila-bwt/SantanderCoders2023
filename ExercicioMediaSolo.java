import java.util.Scanner;

public class ExercicioMediaSolo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        int nota1 = sc.nextInt();

        System.out.println("Digite sua segunda nota: ");
        int nota2 = sc.nextInt();

        System.out.println("Digite sua terceira nota: ");
        int nota3 = sc.nextInt();


        int media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A sua média é: " + media);



        sc.close();
    }
}
