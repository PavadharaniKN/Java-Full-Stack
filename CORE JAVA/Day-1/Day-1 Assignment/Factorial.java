import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int result=1;
       for(int i=1;i<=num;i++)
      {
          result=result*i;
          
      }
          System.out.println(result);
        
        }
    }