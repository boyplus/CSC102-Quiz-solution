import java.util.Scanner;
public class Title {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        int n = sc.nextInt();
        if (n < title.length()) {
            title = title.substring(0,n)+"...";
        }
        System.out.println(title);
    }
}