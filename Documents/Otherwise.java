import java.util.Scanner;
public class Otherwise{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the first integer: ");
int number1 = input.nextInt();

System.out.print("Enter the second integer: ");
int number2 = input.nextInt();

int product = number1 * number2;
System.out.printf("product %d%n", product);

int sum = number1 + number2;
System.out.printf("sum is %d%n", sum);
}
}