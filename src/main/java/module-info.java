module com.example.colorchoserapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.colorchoserapp to javafx.fxml;
    exports com.example.colorchoserapp;
}