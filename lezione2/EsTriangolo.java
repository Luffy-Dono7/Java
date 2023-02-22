import java.util.Scanner;

public class EsTriangolo {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci i lati");
        int lato1 = 5;
        int lato2 = 5;
        int lato3 = 15;
        System.out.println(lato1);
        System.out.println(lato2);
        System.out.println(lato3);
        boolean verifica_triangolo = lato1 + lato2 > lato3 && lato1 + lato3 > lato2 && lato2 + lato3 > lato1;
        System.out.println(" è un triangolo? " + verifica_triangolo);
        tastiera.close();  
    }
}
