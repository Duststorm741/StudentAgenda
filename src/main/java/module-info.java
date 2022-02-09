module com.example.studentagenda {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    requires com.google.gson;

    opens com.example.studentagenda to javafx.fxml;
    exports com.example.studentagenda;
}