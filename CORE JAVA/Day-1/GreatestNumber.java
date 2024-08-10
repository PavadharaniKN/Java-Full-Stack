import java.util.*;
public class GreatestNumber{
public static void main(String args[]){

Scanner scan =new Scanner(System.in);
System.out.println("Enter the 1st number: ");
int a=scan.nextInt();
System.out.println("Enter the 2st number: ");
int b=scan.nextInt();
if(a>b){
System.out.println( a + "is the greatest number");
}
else{
System.out.println(b + "is the greatest number");
}
}
}