import java.util.Scanner;

public class ConvertionProgramm {
    static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double Fahrenheit;
        double Celsius;

        System.out.println("Quelle convertion vouler vous ? :");
        


        System.out.println("Entrer une temperature en Fahrenheit :");
        Fahrenheit = input.nextInt();
        System.out.println("Conversion en Celsius :"+(Fahrenheit - 32) * (5.0/9.0) );
       
     }
    
}
