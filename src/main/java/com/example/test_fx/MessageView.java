package com.example.test_fx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;


public class MessageView extends VBox {
    private Button btnCancel = new Button();
    private Label lblMes = new Label();
    MessageView(Message mes){
        createView(mes);
    }

    public void createView(Message mes){
        VBox newBox = new VBox();
        newBox.setAlignment(Pos.CENTER);

        VBox.setVgrow( newBox, Priority.ALWAYS );
        lblMes.setText(mes.getMessage());
        newBox.getChildren().add(lblMes);
        btnCancel.setOnAction(this::cancel);

        ButtonBar btnbar = new ButtonBar();
        btnbar.setPadding( new Insets(20.0d) );
        ButtonBar.setButtonData(btnCancel, ButtonBar.ButtonData.CANCEL_CLOSE);
        btnbar.getButtons().addAll(btnCancel);
        btnCancel.setText("Cancel");
        this.getChildren().addAll(newBox, new Separator(), btnbar);
    }

    public void cancel(ActionEvent event){
        Platform.exit();
    }

}
