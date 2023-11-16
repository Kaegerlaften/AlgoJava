import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("nb1 = ");
        Integer nb1 = sc.nextInt();
        System.out.println("nb2 = ");
        Integer nb2 = sc.nextInt();
        if (nb1 > nb2) {
            System.out.println(nb1 + " est plus grand que " + nb2 + " !");
        }
        else if (nb2 > nb1) {
            System.out.println(nb2 + " est plus grand que " + nb1 + " !");
        }
        else {
            System.out.println("Ces deux nombres sont égaux !");
        }
    }
}
