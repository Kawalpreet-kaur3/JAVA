import java.util.*;
public class max{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value of first number");
        int a = sc.nextInt();

        System.out.print("enter the value of second number");
        int b = sc.nextInt();

        System.out.print("enter the value of third number");
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b,c));

        System.out.print("The maximum value is: "+  max);
        
        sc.close();
    }
}