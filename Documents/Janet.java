import java.util.Scanner;
public class Janet{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the first integer: ");
int num1 = input.nextInt();

System.out.print("Enter the second integer: ");
int num2 = input.nextInt();

System.out.print("Enter the third integer: ");
int num3 = input.nextInt();

int sum = num1 + num2 + num3;
int ave = sum / 3;
int product = num1 * num2 * num3;

if(num1 < num2 && num1 < num3) {
System.out.println(num1 + " is the smallest number");
}

if(num2 < num1 && num2 < num3){
System.out.println(num2 + " is the smallest number");
}

if(num3 < num2 && num3 < num1){
System.out.println(num3 + " is the smallest number");
}

if(num1 > num2 && num1 > num3) {
System.out.println(num1 + " is the largest number");
}

if(num2 > num1 && num2 > num3){
System.out.println(num2 + " is the largest number");
}

if(num3 > num2 && num3 > num1){
System.out.println(num3 + " is the largest number");
}

}
}

