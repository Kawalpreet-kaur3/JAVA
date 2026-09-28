import java.util.Scanner;
public class fuzzbuzz{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       
        int N = sc.nextInt();

        if(N % 3 ==0 && N % 5 ==0){
            System.out.println("FizzBuzz");
        }else if(N % 3 ==0){
            System.out.println("Fuzz");
        }
        else if(N % 5 ==0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(N);

            sc.close();
//3 5 15 30 7 input 
        }
        
    }
}
