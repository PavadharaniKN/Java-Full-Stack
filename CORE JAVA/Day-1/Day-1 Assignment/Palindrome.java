import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int rem;
        int result=0;
        int temp=0;
        temp=num;
      while(num>0)
      {
          rem=num%10;
          result=(result*10)+rem;
          num=num/10;
      }
      if(temp==result)
      {
          System.out.println("The given number is Palindrome.");
      }
      else{
          System.out.println("The given number is Not a Palindrome.");
      }
        

        }
            
    }