import java.util.Scanner;

public class EsBoolean5 {
    public static void main(String[] args) {
        Scanner tastiera =  new Scanner(System.in);
        System.out.println("inserisci l'anno");
        int anno = 1900;
        System.out.println(anno);
        boolean verifica_anno = anno%4 == 0 && anno%100 != 0 || anno%400 == 0;
        System.out.println(anno + " è un anno bisestile? " + verifica_anno);
        tastiera.close();  
    }
}