import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
       for(int i=0;i<num;i++)
       {
           for(int j=0;j<num;j++)
           {
               if(i==0 || j==0 || i==num-1 || j==num-1)
               {
                   System.out.print("*");
               }
               else{
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}