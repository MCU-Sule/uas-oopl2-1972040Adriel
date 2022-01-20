module com.example.uas {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;


    opens com.example.uas to javafx.fxml;
    exports com.example.uas;
    exports com.example.uas.entity;
}