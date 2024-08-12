import java.util.*;

public class ASCIIValue {
    public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.print("Enter the 1st character:");
           char ch1=scan.next().charAt(0);
           System.out.print("Enter the 1st character:");
           char ch2=scan.next().charAt(0);
           
           int ASCIIValue1 =ch1;
           int ASCIIValue2 =ch2;
           
           System.out.println("ASCII Value for " + ch1 +":" + ASCIIValue1);
           System.out.println("ASCII Value for " + ch2 +":" + ASCIIValue2);
       }
    }