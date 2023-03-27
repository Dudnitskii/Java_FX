package com.example.test_fx;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistrationModel {
    public void registr(Registration req){
        Message mes = new Message("Thanks for registration!" + req.getName() + " " + req.getSurname());
        System.out.println(mes.getMessage());
        MessageView view = new MessageView(mes);
        Stage stage1 = new Stage();
        Scene scene = new Scene(view);
        stage1.setTitle("MVVM App");
        stage1.setScene( scene );
        stage1.setWidth( 480 );
        stage1.setHeight( 320 );
        stage1.show();
    }
}
