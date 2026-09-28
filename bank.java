import java.util.*;
public class bank{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("enter initial value (N): ");
        int N = sc.nextInt();

        System.out.print("enter operation ( ADD/SUBTRACT ): ");
        int X= sc.nextInt();

        System.out.print("enter amount (Y)");
        int Y = sc.nextInt();
// add (credit), substract(debit) 
       if(X==1){
            System.out.print(N+Y);
        }
        else if(X==2 && N < Y){
            System.out.print("insufficient funds");
        }
        else{
            System.out.print(N-Y);
        }
    sc.close();
    }
}