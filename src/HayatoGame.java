import java.util.*;

/**
 * Game of guessing a secret number
 * 
 * @author Hayato Kawai
 *
 */
public class HayatoGame extends NumberGame {

	private int upperBound;
	private int secretNumber;
	private int count = 0;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperBound
	 *            is the max value for the secret number(>1).
	 */
	public HayatoGame(int upperBound) {
		long seed = System.nanoTime();
		Random r = new Random(seed);
		this.upperBound = upperBound;
		secretNumber = r.nextInt(this.upperBound) + 1;
	}

	/**
	 * Evaluate a user's guess.
	 * 
	 * @param number
	 *            is the player's guess
	 * 
	 * @return true if answer is correct and false if answer is incorrect.
	 */
	public boolean guess(int number) {
		count++;
		if (number > this.upperBound || number < 1) {
			setMessage("Out of bound");
			return false;
		} else if (number > secretNumber) {
			setMessage("Your answer is too large");
			return false;
		} else if (number < secretNumber) {
			setMessage("Your answer is too small");
			return false;
		} else {
			setMessage("Your answer is correct :3");
			return true;
		}
	}

	/**
	 * Return the count that the user played.
	 * 
	 * @return count how many time that user played.
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Return the upperBound for the solution to this game
	 * 
	 * @return upperBound is the max value for the secret number(>1).
	 */
	public int getUpperBound() {
		return this.upperBound;
	}

	public int getAnswer() {
		return this.secretNumber;
	}
	/**
	 * Return the general description
	 * 
	 * @return description a general description for a game
	 */
	@Override
	public String toString() {
		String description = "Guess a secret number between 1 and " + this.upperBound;
		return description;
	}
}
