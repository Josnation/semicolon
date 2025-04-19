import java.util.Scanner;
public class Comparing{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
System.out.println("Enter the first integer: ");
int integer1 = input.nextInt();

if(integer1 > 100){
System.out.printf("%d is greater than 100", integer1);
}
if(integer1 == 100){
System.out.printf("%d is equal to 100", integer1);
}
if(integer1 != 100){
System.out.printf("%d is not equal to 100", integer1);
}
if(integer1 < 100){
System.out.printf("%d is less than 100", integer1);
}
int square = integer1 * integer1;
System.out.printf("%d the square", integer1);
}
}