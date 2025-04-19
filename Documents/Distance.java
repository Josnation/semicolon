import java.util.Scanner;
public class Distance{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int number1 = input.nextInt();

System.out.print("Enter the second integer: ");
int number2 = input.nextInt();

int sum = number1 + number2;
System.out.println("sum is the number1 + number2: " + sum);

int product = number1 * number2;
System.out.println("product is the number1 * number2: " + product);

int average = number1 / number2;
System.out.println("average is the number1 / number2: " + average);

int distance = number1 - number2;

if(number1 > number2){
System.out.println("The max is: " + number1);
}
else{
System.out.println("The min is: " + number2);
}




}
}