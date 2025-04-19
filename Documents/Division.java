import java.util.Scanner;
public class Division{
public static void main(String[]args){

Scanner input=new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1=input.nextInt();

System.out.print("Enter the second integer: ");
int num2=input.nextInt();

int divide=num1/num2;
System.out.printf("Divide %d%n", divide);
}
}