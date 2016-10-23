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
	private TextField redisUri;
	
	@FXML
	private TextField auth;
	
	@FXML
	private TextField key;
	
	@FXML
	private TextField hashField;
	
	@FXML
	private TextField hashValue;
	
	@FXML
	protected void getKeyAllAction(ActionEvent event) {
		System.out.println("keyAllGet呼ばれた");
	}
	
	@FXML
	protected void getAction(ActionEvent event) {
		System.out.println("get呼ばれた");
	}
	
	@FXML
	protected void updateAction(ActionEvent event) {
		System.out.println("updateValue呼ばれた");
	}
	
	@FXML
	protected void expireAction(ActionEvent event) {
		System.out.println("expireValue呼ばれた");
	}
	
	@FXML
	protected void deleteAction(ActionEvent event) {
		System.out.println("deleteValue");
	}
}
