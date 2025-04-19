import java.util.Scanner;
public class Largest{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the first integer: ");
int num1 = input.nextInt();

System.out.println("Enter the second integer: ");
int num2 = input.nextInt();

System.out.println("Enter the third integer: ");
int num3 = input.nextInt();

System.out.println("Enter the forth integer: ");
int num4 = input.nextInt();

System.out.println("Enter the fifth integer: ");
int num5 = input.nextInt();

if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
System.out.println(num1 + " is the smallest number");
}
if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
System.out.println(num2 + " is the smallest number");
}
if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
System.out.println(num3 + " is the smallest number");
}
if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
System.out.println(num4 + " is the smallest number");
}
if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
System.out.println(num5 + " is the smallest number");
}
if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
System.out.println(num1 + " is the largest number");
}
if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
System.out.println(num2 + " is the largest number");
}
if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
System.out.println(num3 + " is the largest number");
}
if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
System.out.println(num4 + " is the largest number");
}
if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
System.out.println(num5 + " is the largest number");
}

} 
}