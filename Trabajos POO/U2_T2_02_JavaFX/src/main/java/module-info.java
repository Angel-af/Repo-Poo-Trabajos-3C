module com.example.holamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.holamundojavafx to javafx.fxml;
    exports com.example.holamundojavafx;
}