import java.util.Scanner;

public class Mod3Week1HW2{
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        
        int firstFib = 0;
        int secondFib = 1; 
        int fib;
        
        System.out.println(firstFib);
        System.out.println(secondFib);

        for (int i = 3;i<num;i++){
            fib = firstFib+secondFib;
            System.out.println(fib);
            firstFib = secondFib;
            secondFib=fib;
            
        }

    }
}