package com.example.test_fx;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class RegistrationViewModel{
    private final StringProperty name = new SimpleStringProperty();
    private final StringProperty surname = new SimpleStringProperty();
    private final IntegerProperty age = new SimpleIntegerProperty();

    private final RegistrationConverter converter = new RegistrationConverter();
    private final RegistrationModel model = new RegistrationModel();

    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getSurname() {
        return surname.get();
    }

    public StringProperty surnameProperty() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    public int getAge() {
        return age.get();
    }

    public IntegerProperty ageProperty() {
        return age;
    }

    public void setAge(int age) {
        this.age.set(age);
    }

    public void registraion() {
        Registration data = converter.toRegistration(this);
        model.registr(data);
    }
}
