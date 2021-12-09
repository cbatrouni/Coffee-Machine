module com.login.loginform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.login.loginform to javafx.fxml;
    exports com.login.loginform;
}