import java.util.Scanner;

public class Ex10 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez 10 nombres :");
        int[] tab = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i<10; i++) {
            tab[i] = sc.nextInt();
        }
        int tmp = 0;
        for(int i = 1; i<10; i++) {
            if (tab[i] < tab[i-1]) {
                tmp = tab[i-1];
                tab[i-1] = tab[i];
                tab[i] = tmp;
                i = 1;
            }
        }
        for (int i = 0; i<10; i++) {
            System.out.println(tab[i]);
        }
    }
}