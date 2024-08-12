import java.util.*;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int rem;
        int number=0;
        int result=0;
           int temp=0;
           temp=num;
        while(temp>0)
        {
            temp/=10;
            number++;
        }
     
      temp=num;
      while(temp >0){
          rem=temp%10;
          result+=  Math.pow(rem,number);
          temp/=10;
      }
      if(num==result){
      System.out.println("The given number is ArmStrong.");
    }
    else{
        System.out.println("The given number is not a ArmStrong.");
    }
}
}
