import java.util.Scanner;   

public class IfElse{ 
     public static void main(String[]args){

        Scanner sc = new Scanner (System.in);
        String name = sc.nextLine();
        System.out.println("Enter your age");
        int x = sc.nextInt();
        if(x >=0 && x <=12){
         System.out.println(x+":child");
         }else if(x >=13 && x <=19){ 
               System.out.println(x+":teenager");
         }else if(x >=20 && x <=40){
               System.out.println(x+":young");
         }else if(x >=41 && x <=60){
               System.out.println(x+":Middle aged");
         }else{
               System.out.println(x+":senior citizen"); 
     }
   }
}