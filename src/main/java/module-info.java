module com.example.oopsection1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopsection1 to javafx.fxml;
    exports com.example.oopsection1;
}