import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt(), n = sc.nextInt();
        int h = (n - y) / x;
        int ans = x * h + y;
        System.out.println(ans);
    }
}