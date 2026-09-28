import java.util.Scanner;   

public class main{ 
     public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        String x = sc.nextLine();


        System.out.println("Enter your age:");
        int x= sc.nextInt();

        if(x >=0 && x <=12){
         System.out.println(":child");
         }else if(x >=13 && x <=19){ 
               System.out.println(":teenager");
         }else if(x >=20 && x <=40){
               System.out.println(":young");
         }else if(x >=41 && x <=60){
               System.out.println(":Middle aged");
         }else{
               System.out.println(":senior citizen"); 
               sc.close();

     }
   }
}