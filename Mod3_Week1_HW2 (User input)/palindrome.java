import java.util.Scanner;

import javax.print.FlavorException;
import javax.swing.event.SwingPropertyChangeSupport;

public class palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        String empty="";
        boolean pal;

        int b = 0, e = str.length() - 1;

        
            while (b < e) {
                if (str.charAt(b) != str.charAt(e)) {
                    System.out.println(str + " is not a panlindrone");
                    pal=false;
                    System.exit(0);//succesful termination
                }
                b++;
                e--;
                
            }System.out.println(str + " is a Palindrome");


        
            
    }

}
