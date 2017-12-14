package main.java.thesis.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import main.scala.thesis.DemoFunction;

public class MainController {

	@FXML
	private JFXTextArea searchingContent;
	@FXML
	private JFXTextField noOfResult;
	@FXML
	private JFXListView<Label> resultsView;

	@FXML
	void search(ActionEvent event) throws FileNotFoundException {

		searchingContent.setDisable(true);
		noOfResult.setDisable(true);

		DemoFunction df = new DemoFunction();
		String result = df.calculate();
		Label item = new Label("Document #86", new ImageView("main/java/thesis/view/doc_icon.png"));
		Label item2 = new Label("Document #290", new ImageView("main/java/thesis/view/doc_icon.png"));
		Label item3 = new Label("Document #7", new ImageView("main/java/thesis/view/doc_icon.png"));
		Label item4 = new Label("Document #15", new ImageView("main/java/thesis/view/doc_icon.png"));
		Label item5 = new Label("Document #742", new ImageView("main/java/thesis/view/doc_icon.png"));
		Label item6 = new Label("Document #180", new ImageView("main/java/thesis/view/doc_icon.png"));
		Label item7 = new Label("Document #558", new ImageView("main/java/thesis/view/doc_icon.png"));
		Label item8 = new Label("Document #40", new ImageView("main/java/thesis/view/doc_icon.png"));

		resultsView.getItems().add(item);
		resultsView.getItems().add(item2);
		resultsView.getItems().add(item3);
		resultsView.getItems().add(item4);
		resultsView.getItems().add(item5);
		resultsView.getItems().add(item6);
		resultsView.getItems().add(item7);
		resultsView.getItems().add(item8);

		searchingContent.setDisable(false);
		noOfResult.setDisable(false);

	}
}
