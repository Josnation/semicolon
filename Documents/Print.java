import java.util.Scanner;
public class Print{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Enter the first number: ");
int num1 = input.nextInt();

System.out.print("Enter the second number: ");
int num2 = input.nextInt();
System.out.print("Enter the third number: ");
int num3 = input.nextInt();
System.out.print("Enter the forth number: ");
int num4 = input.nextInt();
System.out.print("Enter the fifth number: ");
int num5 = input.nextInt();
if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
System.out.println("is the largest number:" + num1);
}
if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
System.out.println("is the largest number:" + num2);
}
if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
System.out.println("is the largest number:" + num3);
}
if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
System.out.println("is the largest number:" + num4);
}
if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
System.out.println("is the largest number:" + num5);
}
if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
System.out.println("is the smallest number:" + num1);
}
if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
System.out.println("is the smallest number:" + num2);
}
if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
System.out.println("is the smallest number:" + num3);
}
if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
System.out.println("is the smallest number:" + num4);
}
if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
System.out.println("is the smallest number:" + num5);
}
int even = 0; 
if(num1 % 2 == 0);
if(num2 % 2 == 0);
if(num3 % 2 == 0);
if(num4 % 2 == 0);
if(num5 % 2 == 0);
System.out.println("even numbers: " + even);
int average = num1 % num2 % num3 % num4 % num5;
System.out.print(average);
}
}