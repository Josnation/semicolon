import java.util.Scanner;
public class Weight{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the weight: ");
int w = input.nextInt();

if(w > 0 && w <= 1){
System.out.print("The cost of shipping is 3.5");
}
else if(w >1 && w <=3){
System.out.print("The cost of shipping is 5.5");
}
else if(w > 3 && w <=10){
System.out.print("The cost of shipping is 8.5");
}
else if(w > 10 && w <=20){
System.out.print("The cost of shipping is 10.5");
}
System.out.printf("Weight %d%n", weight);
}
}