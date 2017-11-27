import java.util.Scanner;

public class printer3d {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println((int) (1.9999999 + (Math.log(n) / Math.log(2))));
    }
}
