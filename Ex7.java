import java.util.Scanner;

public class Ex7 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Quelle limite imposez-vous ?");
        Integer lim = sc.nextInt();
        for(Integer i = 2;i <= lim;i += 2) {
            System.out.println(i);
        }
    }
}