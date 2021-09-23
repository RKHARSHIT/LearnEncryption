import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;
        int t,l,i;
        char ch,c,chr;
        System.out.println("Enter the message : ");
        s = in.nextLine();
        l = s.length();
        for (i=0; i<l; ++i){
            //System.out.print(s.charAt(i));
            ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                t = (int)ch + 5;
            }else {
                t = (int)ch - 3;
            }
            c = (char)t;
            System.out.print(c);
        }
    }
}
