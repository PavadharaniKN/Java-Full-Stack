import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int number=0;
         int flag=0;
        number=num/2;
        
           if(num==0 || num==1){
            System.out.println("The given number is Not a prime number. ");
           }
        else{
            for(int i=2;i<=number;i++)
            {
                if(num%i==0)
                {
                    System.out.println("The given number is not a Prime number.");
                      flag=1;
                      break;
                }
            }
                if(flag==0){
                    System.out.println("The given number is Prime Number.");
                }
            }
        }
            
    }

