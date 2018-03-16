
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GuessingGameController {
	@FXML
	private Label label;
	@FXML
	private TextField textfield;
	@FXML
	private Button button1;
	private CounterView1 view;
	private NumberGame game;

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

	@FXML
	public void initialize() {
		view.run();
	}

	public GuessingGameController() {
		game = new HayatoGame(100);
		view = new CounterView1(game);
	}
}