import java.util.Scanner;

public class Main {
    public static void main(String[] args) { //Constructeur de la classe
        Scanner scan = new Scanner(System.in); //Instance un nouveau Scanner qu'on appelle "scan"
        System.out.println("Bonjour, quel est votre prénom ?");
        String prenom = scan.nextLine();
        System.out.println("---BONJOUR---\nRentrez un Entier"); //print du texte
        int unEntier = scan.nextInt(); //créer un entier qui lit ce que l'utilisateur écrit
        System.out.println("Rentrez un Réel"); //print du texte
        float unReel = scan.nextFloat(); //créer un float qui lit ce qu' l'utilisateur écrit

        System.out.println("Bonjour " + prenom + " !"); //print du texte et le prenom
        System.out.println("Ton entier est " + unEntier); //print du texte et la variable
        System.out.println("Ton réel est " + unReel); //print du texte et l'autre variable
    }
}