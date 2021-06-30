package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class RootController implements Initializable {
	@FXML private Button btnputIn;
	@FXML private Button btngetOut;
	@FXML private Button btnback;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnputIn.setOnAction(e->putIn(e));
		btngetOut.setOnAction(e->getOut(e));
		btnback.setOnAction(e->back(e));
	}
	
	public void select(ActionEvent event) {
		System.out.println("자리 선택중...");
	}
	
	public void putIn(ActionEvent event) {
		try {
			Parent rootIn = FXMLLoader.load(getClass().getResource("rootIn.fxml"));
			StackPane root = (StackPane) btnputIn.getScene().getRoot();
			root.getChildren().add(rootIn);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getOut(ActionEvent event) {
		try {
			Parent rootOut = FXMLLoader.load(getClass().getResource("rootOut.fxml"));
			StackPane root = (StackPane) btngetOut.getScene().getRoot();
			root.getChildren().add(rootOut);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void back(ActionEvent event) {
		try {
			Parent rootBack = FXMLLoader.load(getClass().getResource("rootBack.fxml"));
			StackPane root = (StackPane) btnback.getScene().getRoot();
			root.getChildren().add(rootBack);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	
}
