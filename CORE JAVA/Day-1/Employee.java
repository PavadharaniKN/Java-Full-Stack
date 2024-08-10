import java.util.Scanner;

public class Employee{
public static void main(String args[]){
int employeeId;
String employeeName;
float employeeSalary; 
Scanner sc = new Scanner(System.in);

System.out.println("Enter the employee id");
employeeId=sc.nextInt();

System.out.println("Enter the employee Name: ");
employeeName=sc.next();

System.out.println("Enter the employee Salary: ");
employeeSalary=sc.nextFloat();

System.out.println("Enter the employee id" + employeeId);
System.out.println("Enter the employee Name: " + employeeName);
System.out.println("Enter the employee Salary: " + employeeSalary);

}
}