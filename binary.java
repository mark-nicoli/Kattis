import java.util.Scanner;

public class binary
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        int original = Integer.parseInt(scan.nextLine());
        String binaryString = Integer.toBinaryString(original);
        String reverseBinary = "";
        int binaryLength = binaryString.length();
        for (int i = 0; i < binaryLength; i++) reverseBinary += binaryString.charAt(binaryLength - i - 1);
        int newnum = Integer.parseInt(reverseBinary, 2);

        System.out.println(Integer.toString(newnum));
    }
}