package com.example.test_fx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class RegistrationView extends VBox{
    private GridPane gp = new GridPane();

    private TextField tfName = new TextField();
    private TextField tfSurname = new TextField();
    private TextField tfAge = new TextField();
    private Button btnReg = new Button("Registration");
    private Button btnCancel = new Button("Cancel");

    private final RegistrationViewModel viewModel = new RegistrationViewModel();
    public RegistrationView(){
        createView();
        bindViewModel();
    }

    public void createView(){
        VBox newBox = new VBox();
        newBox.setAlignment(Pos.CENTER);

        gp.setPadding( new Insets(40) );
        gp.setVgap( 4 );
        gp.add(new Label("Name"), 0, 0);        gp.add(tfName, 1, 0);
        gp.add(new Label("Surname"), 0, 1);     gp.add(tfSurname, 1, 1);
        gp.add(new Label("Age"), 0, 2);         gp.add(tfAge, 1, 2);

        final ColumnConstraints col = new ColumnConstraints();
        col.setPercentWidth( 50 );

        gp.getColumnConstraints().addAll( col, col );

        newBox.getChildren().add( gp );

        VBox.setVgrow( newBox, Priority.ALWAYS );

        btnCancel.setOnAction(this::cancel);
        btnReg.setOnAction(this::registration);

        ButtonBar btnbar = new ButtonBar();
        btnbar.setPadding( new Insets(20.0d) );
        ButtonBar.setButtonData(btnReg, ButtonBar.ButtonData.OK_DONE);
        ButtonBar.setButtonData(btnCancel, ButtonBar.ButtonData.CANCEL_CLOSE);
        btnbar.getButtons().addAll( btnReg, btnCancel);
        this.getChildren().addAll(newBox, new Separator(), btnbar);
    }
    private void bindViewModel() {

        tfName.textProperty().bindBidirectional(viewModel.nameProperty());
        tfSurname.textProperty().bindBidirectional(viewModel.surnameProperty());
    }

    public void registration(ActionEvent event){
        viewModel.registraion();
    }
    public void cancel(ActionEvent event){
        Platform.exit();
    }

}
