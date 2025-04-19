import java.util.Scanner;

public class Olamide  {
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1 = input.nextInt();

System.out.print("Enter the second integer: ");
int num2 = input.nextInt();

int square1 = num1 * num1;
int square2 = num2 * num2;

int sumOfSquares =(square1 + square2);

int differenceOfSquares =(square1 - square2);

System.out.println("The Square of first integer: " + square1);

System.out.println("The Square of second integer: " + square2);

System.out.println("The sum of squares: " + sumOfSquares);

System.out.println("The difference of square: " + differenceOfSquares);
}
}