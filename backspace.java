import java.util.Scanner;
public class backspace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char stringarr[] = string.toCharArray();
        int count = 0;
        for (int i = stringarr.length-1; i>=0; i--) {
            if (stringarr[i] == '<'){
                stringarr[i] = ' ';
                count++;
            }
            else if (count>0){
                stringarr[i] = ' ';
                count--;
            }
        }
        string = new String(stringarr);
        System.out.print(string.replaceAll(" ", ""));
        scan.close();
    }
}
