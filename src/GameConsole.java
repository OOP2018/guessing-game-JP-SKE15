import java.util.Scanner;

/**
 * Play guessing game on the console.
 * @author Hayato Kawai
 */

public class GameConsole {

	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param game
	 *            Constructor for a game
	 * @return guess return a correct answer
	 */
	public int play(NumberGame game) {
		Scanner console = new Scanner(System.in);
		// describe the game
		System.out.println(game.toString());
		System.out.println(game.getMessage());
		boolean correct;
		int guess;
		do {
			System.out.print("Your answer? : ");
			guess = console.nextInt();
			correct = game.guess(guess);
			System.out.println(game.getMessage());
		} while (correct == false);
		return guess;
	}

}
