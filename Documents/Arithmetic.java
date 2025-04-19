import java.util.Scanner;
public class Arithmetic{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1 = input.nextInt();

System.out.print("Enter the second integer: ");
int num2 = input.nextInt();

int num1 = num1 * num1;
int num2 =num2 * num2;
 
int sum = num1 + num2;
System.out.print("The sum of square is", num1 + num2);

int difference = num1 - num2;
System.out.print("The difference of square is", num1 - num2);
}
}