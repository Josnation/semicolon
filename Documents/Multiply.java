import java.util.Scanner;
public class Multiply{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the radius of the circle: ");
int  r = input.nextInt();

int diameter = 2*r;
double circumference = 2*3.14159*r;
double area = 3.14159*3.14159*r;

System.out.printf("The diameter is %d%n",diameter);
System.out.printf("The circumference is %f%n",circumference);
System.out.printf("The area is %f%n",area);
}
}