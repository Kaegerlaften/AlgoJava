import java.util.Scanner;

public class Ex5 {
    public static void main(String args[]) {
        Integer nbRef = (int)(Math.random() * 3 + 1);
        Scanner sc = new Scanner(System.in);
//        System.out.println(nbRef); //Permet d'afficher la solution avant
        System.out.println("Choisis un nombre entre 1 et 3");
        Integer nb1 = sc.nextInt();
        if (nb1 == nbRef) {
            System.out.println("Bien joue ! Le numéro qu'il fallait deviner était " + nbRef);
        } else {
            System.out.println("Oops ! Dommages, ce n'etait pas la bonne valeur.");
        }
    }
}
