module com.example.shapeprogram {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.shapeprogram to javafx.fxml;
    exports com.example.shapeprogram;
}