module com.example.javafxfinalprojectbasdat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires com.microsoft.sqlserver.jdbc;

    opens com.example.javafxfinalprojectbasdat to javafx.fxml;
    exports com.example.javafxfinalprojectbasdat;
}