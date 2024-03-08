module com.example.d23javafxhelloworld {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.d23javafxhelloworld to javafx.fxml;
    exports com.example.d23javafxhelloworld;
}