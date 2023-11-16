import java.util.Scanner;

public class Ex4 {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel age as-tu ?");
        Integer age = sc.nextInt();
        switch (age) {
            case 6 & 7:
                System.out.println("Poussin");
                break;
        
            case 8 & 9:
                System.out.println("Pupille");
                break;
            case 10 & 11:
                System.out.println("Minime");
                break;
            default:
                if (age > 12) {
                    System.out.println("Cadet");
                }
                break;
        }
    }
}
