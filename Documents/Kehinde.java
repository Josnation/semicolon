import java.until.Scanner;
public class Kehinde{
public static void main(String[]args){
Scanner input =new Scanner(System.in);

System.out.print("Enter the first integer: ");
int number1 = input.NextInt();

System.out.print("Enter the second integer: ");
int number2 = input.NextInt();

input sum = number1+number2;
System.out.printf("Sum is %d%n",sum);
}
}