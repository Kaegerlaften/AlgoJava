import java.util.Scanner;

public class Ex3 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel age as-tu ?");
        Integer age = sc.nextInt();
        System.out.println(age > 18 ? "Majeur": "Mineur");
    }
}
