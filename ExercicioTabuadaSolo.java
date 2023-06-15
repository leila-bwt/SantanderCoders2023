import java.util.Scanner;

public class ExercicioTabuadaSolo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tabuada iremos fazer hoje?");

        int tabuada = sc.nextInt();
        int i = 1;

        for(i=1; i <= 10; i++){
            int resultado = tabuada * i;
            System.out.println(resultado);

        }


        
        
        sc.close();
    }
}
