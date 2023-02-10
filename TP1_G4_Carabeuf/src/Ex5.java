import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        maFonction();
        somme();
    }

    public static void maFonction() {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("BONJOUR \nVeuillez saisir le premier entier");
        int premierEntier = scan1.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scan1.nextInt();
        float somme = premierEntier / deuxiemeEntier;
        System.out.println("La division de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale à " + somme);
    }

    public static void somme() {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("BONJOUR \nVeuillez saisir le premier entier");
        int premierEntier = scan2.nextInt();
        System.out.println("Veuillez saisir le deuxieme entier");
        int deuxiemeEntier = scan2.nextInt();
        int somme = premierEntier + deuxiemeEntier;
        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est egale à " + somme);
    }
}
