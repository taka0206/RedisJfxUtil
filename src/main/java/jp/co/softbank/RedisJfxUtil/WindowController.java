package jp.co.softbank.RedisJfxUtil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class WindowController {
	
	@FXML
	private Label label1;
	
	@FXML
	private TextField text1;
	
	@FXML
	protected void buttonAction(ActionEvent event) {
		String str = text1.getText();
		label1.setText("Hello, " + str + "!!");
	}
}
