import java.util.Scanner;

public class Ex8 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez 10 nombres :");
        int[] tab = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < 10; i++) {
            tab[i] = sc.nextInt();
        }
    }
}