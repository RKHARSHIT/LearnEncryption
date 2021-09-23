import java.util.Scanner;

public class EncryptionDecryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch,c;
        int t;
        System.out.println("Enter the letter : ");
        ch = in.next().charAt(0);
        if (Character.isUpperCase(ch)){
            t = (int)ch + 5;
        }else{
            t = (int)ch - 3;
        }
        c = (char)t;
        System.out.println("The encoded character is " + c);
    }
}
