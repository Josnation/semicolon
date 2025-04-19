import java.util.Scanner;
import java.util.Random;

public class ScissorPaperRock{
public static void main(String[]args){

Scanner scanner = new Scanner(System.in);
Random random = new random(0, 3);
System.out.println("Enter a number from 0 to 2: ");
int counterUser = 0;
int myGuess = scanner.nextInt();
while(true){
if (myGuess == 0 && computerChoice == 0){
System.out.print("The computer is scissor. You are scissor. it draw");
}
if (myGuess == 0 && computerChoice == 1){
System.out.print("The computer is rock. You are scissor. You loss");
}
if (myGuess == 0 && computerChoice == 2){
System.out.print("The computer is paper. You are scissor. it won");
}
if (myGuess == 1 && computerChoice == 0){
System.out.print("The computer is rock. You are scissor. You loss");
}
if (myGuess == 1 && computerChoice == 1){
System.out.print("The computer is rock. You are rock. it draw");
}
if (myGuess == 1 && computerChoice == 2){
System.out.print("The computer is scissor. You are paper. it won");
}
if (myGuess == 2 && computerChoice == 0){
System.out.print("The computer is scissor . You are paper. You loss");
}
if (myGuess == 2 && computerChoice == 1){
System.out.print("The computer is rock. You are paper. You loss");
}
if (myGuess == 2 && computerChoice == 2){
System.out.print("The computer is paper. You are paper. it draw");
}

}
}
}