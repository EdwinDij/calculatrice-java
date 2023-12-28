package calculatrice;
import java.util.Scanner;

public class calculatrice {
    public static void addition() {
    Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre : ");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est: " + (Integer.parseInt(first) + Integer.parseInt(second)));

        sc.close();
    }
    
    public static void soustraction() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre : ");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est : " + (Integer.parseInt(first) - Integer.parseInt(second)));
        sc.close(); 
    }

    public static void multiplication() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre :");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est : " + (Integer.parseInt(first) * Integer.parseInt(second)));
        sc.close();
    }

    public static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Saisir le premier nombre :");
        String first = sc.nextLine();
        System.out.print("Saisir le deuxième nombre : ");
        String second = sc.nextLine();
        System.out.print("Le résultat est : " + (Double.parseDouble(first) / Double.parseDouble(second)));
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
}
