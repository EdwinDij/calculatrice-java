package calculatrice;
import java.util.Scanner;

public class calculatrice {
    public static void addition() {
    Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre : ");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est: " + (Integer.parseInt(first) + Integer.parseInt(second)) + "\n");
        useAgain();
        sc.close();
    }
    
    public static void soustraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre : ");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est : " + (Integer.parseInt(first) - Integer.parseInt(second)) + "\n");
        useAgain();
        sc.close(); 
    }

    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre :");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est : " + (Integer.parseInt(first) * Integer.parseInt(second)) + "\n");
        useAgain();
        sc.close();
    }

    public static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre :");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est : " + (Double.parseDouble(first) / Double.parseDouble(second)) + "\n");
        useAgain();
        sc.close();
    }

    public static void chooseOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choississez entre: Addition, Multiplication, Division, Soustraction : ");
        String choice = sc.nextLine();

        if(choice.equals("Addition")){
            addition();
        } else if (choice.equals("Multiplication")){
            multiplication();
        } else if (choice.equals("Division")){
            division();
        } else if (choice.equals("Soustraction")){
            soustraction();
        } else {
            System.out.println("Opération inconnue");
            chooseOperation();
        }
        sc.close();
    }

    public static void useAgain() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Voulez-vous faire un autre calcule ? [Y = yes || N = no] ");
        String answer = sc.nextLine();

        if(answer.equals("Y")) {
            chooseOperation();
        } else {
            System.out.print("Aurevoir!");
            sc.close();
        }
    }
}
