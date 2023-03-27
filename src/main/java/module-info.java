module com.example.test_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.test_fx to javafx.fxml;
    exports com.example.test_fx;
}