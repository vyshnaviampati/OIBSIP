package Infobyte;

import java.util.Scanner;

public class NumberGame [

public static void main(String[] args) [ Scanner scanner = new Scanner(System.in); final int MAX ATTEMPTS = 5;

int round 1:

int score 0:

while (true) [ System.out.println("Round + round): int randomNumber (int) (Math.random()*100)+1; int attempts = 0; I

while (attempts < MAX ATTEMPTS) { System.out.print("Guess the number (between 1 and 100): "); int guess scanner.nextInt();

if (quess randomNumber) [ System.out.println("Wah! You have guessed the number correctly"); score += MAX ATTEMPTS- attempts;

break;

} else if (quess < random Number) [

System.out.println("The number you entered is too low.");

} else {

System.out.println("The number you entered is too high.");

}
attempts++;
}
if (attempts== MAX_ATTEMPTS) {

System.out.println("Sorry, Your attempts exceeded. The correct is " + randomNumber);
}
System.out.println("Your score after "+round+" rounds is:" + score): System.out.print("Do you want to play again? (yes/no): "); 
String playAgain=scanner.next();

if (!playAgain.equalsIgnoreCase ("yes")) {

break;
}


round++;
}
System.out.println("Thanks for playing!"); 
scanner.close();
}
}

