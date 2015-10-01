import java.util.Scanner;
public class GuessANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computerNum;
		computerNum = 0 + (int) (Math.random()*10);
		
		System.out.println("Pls, input guess number:");
		int guess = input.nextInt();
		
	if (guess == computerNum){
		System.out.println("BINGO !!!");
	}
		else{ while (guess != computerNum){
		if (guess < computerNum) {
			System.out.println("Your guess is too small");
			
		}
		else if (guess > computerNum) {
			System.out.println("Your guess it too big");
				}
		System.out.println("Guess again :");
		guess = input.nextInt();}
		}
	System.out.println("Random number is :"+ computerNum);
	}
	
}

