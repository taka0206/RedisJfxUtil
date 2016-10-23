package jp.co.softbank.RedisJfxUtil;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

import org.apache.commons.lang.StringUtils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import redis.clients.jedis.Jedis;

public class WindowController {
	
	@FXML
	private TextField redisUri;
	
	@FXML
	private TextField redisPort;
	
	@FXML
	private TextField auth;
	
	@FXML
	private TextField key;
	
	@FXML
	private TextField hashField;
	
	@FXML
	private TextField hashValue;
	
	protected void validateCheck(String redisUri, String port) {
		if (StringUtils.isBlank(redisUri) || StringUtils.isBlank(port)) {
			throw new IllegalArgumentException();
		}
	}
	
	protected Jedis connectRedis(String redisUri, int port, String auth) 
			throws UnsupportedEncodingException, IOException {
		
		Path path = FileSystems.getDefault().getPath(
				System.getProperty("user.home") + 
				File.separator + 
				".redisutil_conf.properties");
		Jedis jedis = new Jedis(redisUri, port, 1000);
		jedis.connect();
		StringBuilder sb = new StringBuilder();
		sb.append(redisUri).append(",").append(port).append(",");
		if (StringUtils.isNotBlank(auth)) {
			auth = auth.trim();
			sb.append("," + auth);
			jedis.auth(auth);
		}
		Files.write(path, sb.toString().getBytes("UTF-8"));
		return jedis;
	}
	
	@FXML
	protected void getKeyAllAction(ActionEvent event) {
		validateCheck(redisUri.getText(), redisPort.getText());
		JeconnectRedis()
		
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
