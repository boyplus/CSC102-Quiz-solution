import java.util.Scanner;

public class Matching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.equals(b)) {
            System.out.println("Perfect Match");
        } else if (a.equalsIgnoreCase(b)) {
            System.out.println("Partial Match");
        } else if (a.toLowerCase().contains(b.toLowerCase()) || b.toLowerCase().contains(a.toLowerCase())) {
            System.out.println("Partial Match");
        } else {
            System.out.println("Not Match");
        }
    }
}