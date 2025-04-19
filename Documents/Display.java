import java.util.Scanner;
public class Display{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.print("Enter the first integer: ");
int number1 = input.nextInt();

System.out.print("Enter the second integer: ");
int number2 = input.nextInt();

if(number1 > number2){
System.out.println("the the largest number:" + number1);
}
if(number2 > number1){
System.out.println("the largest number is:" + number2);
}
if(number1 == number2) {
System.out.print("0");
}
if(number1 % 6 != 0){

System.out.print("number1 is the smallest" + number1);
}
if(number2 % 6 == 0){
System.out.print("number2 is the largest" + number2);
}
}
}