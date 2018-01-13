
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
		int max = game.getUpperBound();
		int min = 1;
		do {
			guess = min + (max - min) / 2;
			correct = game.guess(guess);
			if (game.getMessage().equals("Your answer is too large")) {
				max = guess - 1;
			} else if (game.getMessage().equals("Your answer is too small")) {
				min = guess + 1;
			}
		} while (correct == false);
		return guess;
	}

}