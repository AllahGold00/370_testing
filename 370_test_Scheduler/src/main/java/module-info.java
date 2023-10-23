module com.example._370_test_scheduler {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example._370_test_scheduler to javafx.fxml;
    exports com.example._370_test_scheduler;
}