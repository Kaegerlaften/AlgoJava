import java.util.Scanner;

public class Ex6 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorielle a calculer :");
        Integer fac = sc.nextInt();
        float res = fac;
        for(Integer i = fac;i > 1;i--) {
            res = res * (i - 1);
        }
        System.out.println(fac + "! = " + res);
    }
}