import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){

        int num, d, total = 0;
        

        System.out.println("enter  a number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();


        for(int i=num; i!=0; i/=10){
            d = i % 10;
            total = total + d*d*d;
        }
        if(total == num)
            System.out.println(num + " is Armstrong");
        else{
            System.out.println(num + " is not  Armstrong");
        }
            
    }

}