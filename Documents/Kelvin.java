import java.util.Scanner;
public class Kelvin{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the first integer: ");
int num1 = input.nextInt();

System.out.print("Enter the second integer: ");
int num2 = input.nextInt();

System.out.print("Enter the third integer: ");
int num3 = input.nextInt();

System.out.print("Enter the fourth integer: ");
int num4 = input.nextInt();

System.out.print("Enter the fifth integer: ");
int num5 = input.nextInt();

int sum = num1 + num2 + num3 + num4 + num5;
System.out.print(sum);
}
}