import java.util.*;

public class FibonaaciSeries {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scan.nextInt();
        int num1=0;
        int num2=1;
        for(int i=0;i<num;i++)
        {
            int num3=num2+num1;
            num1=num2;
            num2=num3;
            System.out.print(num1+" ");
        }
            
    }
}