import java.util.*;

public class IntegerValues{
public static void main(String args[]){
int arr[]=new int[5];
int sum=0;

Scanner scan=new Scanner(System.in);
System.out.println("Enter the 5 Interger");
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();
}

System.out.println("Array Elements are:");
for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
sum=sum+arr[i];
}
System.out.println("Sum of the given Integer:" sum);

}

}