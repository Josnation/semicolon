import java.util.Scanner;
public class Currency{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the exchange rate: ");
double exchange = input.nextDouble();

if (exchange < 0) {
System.out.println("Enter a valid exchange rate");
}else {
System.out.print("Enter 0 to convert dollars to Rmb and 1 vice versa: ");
double input1 = input.nextDouble();

if (input1 == 0){
System.out.print("Enter dollar amount: ");
double dollarAmount = input.nextDouble();

if (dollarAmount < 0 ){
System.out.println("Please enter a valid amount");
}else if (dollarAmount > 0){
double rmbConversion = exchange * dollarAmount;
System.out.printf("$%.1f is %.1f", dollarAmount, rmbConversion);
}

}





















}
































}
}