import java.util.Random;

/**
 * Automatically find the secret to any NumberGame.
 * 
 * @author HAYATO
 */
public class GameSolver {
	/**
	 * Play a NumberGame and return the solution. The NumberGame object must provide
	 * messages (Message) containing the phrase "too small" if a guess is too small
	 * and"too large" if a guess is too large, for efficient solution.
	 * 
	 * @param game
	 *            is the NumberGame to solve
	 * @return the correct answer
	 */
	public int play(NumberGame game) {

		// describe the game
		System.out.println(game.toString());

		// This is just an example.
		System.out.println(game.getMessage());
		boolean correct;
		int guess;
		Random rand = new Random();
		do {
			System.out.println("Your answer? ");
			guess = rand.nextInt(100) + 1;
			correct = game.guess(guess);
			System.out.println(game.getMessage());
		} while (correct == false);
		return guess;
	}

}