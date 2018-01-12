import java.util.Random;

/**
 * Automatically find the secret to any NumberGame.
 * 
 * @author Hayato Kawai
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
		boolean correct;
		int guess;
		Random rand = new Random();
		do {
			guess = rand.nextInt(100) + 1;
			correct = game.guess(guess);
//			if (game.getCount() > game.getUpperBound()) {
//				System.out.println("I give up");
//				System.exit(0);
//			}
		} while (correct == false);
		return guess;
	}

}