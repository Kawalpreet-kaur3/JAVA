import java.util.*;
public class music{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of albums sold");
        int N = sc.nextInt();
        
        if(N >= 500000 && N < 1000000){
            System.out.print("gold");
        }
        else if(N >= 1000000 && N < 10000000){
            System.out.print("platinum");
        }
        else if(N >= 10000000){
            System.out.print("diamond");
        }
        else{
            System.out.print("none");


        }
        sc.close();
    }
}