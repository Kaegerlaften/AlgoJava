import java.util.Scanner;

public class Ex9 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez 10 nombres :");
        int[] tab = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i<10; i++) {
            tab[i] = sc.nextInt();
        }
        int av = 0;
        for(int i = 0; i<10; i++) {
            av = av + tab[i];
        }
        System.out.println("La moyenne est de : " + av/10);
    }
}