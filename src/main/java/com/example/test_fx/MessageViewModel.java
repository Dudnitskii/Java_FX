package com.example.test_fx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class MessageViewModel {
    private final StringProperty message = new SimpleStringProperty();

    public String getMessage() {
        return message.get();
    }

    public StringProperty messageProperty() {
        return message;
    }

    public void setMessage(String message) {
        this.message.set(message);
    }
}
