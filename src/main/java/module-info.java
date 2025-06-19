module com.krieger.demo_fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.krieger.demo_fx to javafx.fxml;
    exports com.krieger.demo_fx;
}