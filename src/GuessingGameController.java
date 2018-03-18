
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *  UI controller for events and initializing components
 * @author Hayato Kawai
 *
 */
public class GuessingGameController {
	@FXML
	private Label label;
	@FXML
	private TextField textfield;
	@FXML
	private Button button1;
	@FXML Label label2;
	private CounterView view;
	private NumberGame game;

	/**
	 * submit the answer and update the counter value.
	 */
	public void Submit(ActionEvent event) {
		int answer = 0;
		String word = textfield.getText().trim();
		if (word.isEmpty())
			return;
		try {
			answer = Integer.parseInt(word);
		} catch (NumberFormatException ex) {
			label.setText("not a number");
		}
		boolean correct = game.guess(answer);
		label.setText(game.getMessage());
		view.displayCount();
	}

	/**
	 * run the counter window
	 */
	@FXML
	public void initialize() {
		view.run();
	}

	/**
	 * initialize game and counter view
	 */
	public GuessingGameController() {
		game = new HayatoGame(100);
		view = new CounterView(game);
	}
}