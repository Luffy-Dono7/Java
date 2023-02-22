import java.util.Scanner;
import javax.print.event.PrintEvent;

public class Esercizio3 {
    public static void main(String[] args){
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("metti i gradi fahrenheit:");
        double fa = Double.parseDouble(tastiera.nextLine());
        double gradiCelsius = 5 * (fa - 32) / 9;
        gradiCelsius = Math.round(gradiCelsius*100)/100.0;
        System.out.println(gradiCelsius);
    }
}
