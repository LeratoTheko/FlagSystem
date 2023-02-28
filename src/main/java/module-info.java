module com.example.flagsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flagsystem to javafx.fxml;
    exports com.example.flagsystem;
}