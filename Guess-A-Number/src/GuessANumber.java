import java.util.Scanner;
public class GuessANumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int computerNum;
		computerNum = 0 + (int) (Math.random()*10);
		System.out.println(computerNum);
		
			
			
		System.out.println("You have 3 tries to guess the number \nPls, input guess number:");
		int guess = input.nextInt();
		
	if (guess == computerNum){
		System.out.println("BINGO 1 shot !!!");
	}
		else{
			int count = 1;
			while (count<3){count++;
					
			
		if (guess < computerNum) {
			System.out.println("Your guess is too small");
			
		}
		else if (guess > computerNum) {
			System.out.println("Your guess it too big");
				}
		System.out.println("try ,Guess again :");
		guess = input.nextInt();
		}
	System.out.println("Bingo Random number is :"+ computerNum);
		}
	}
}

