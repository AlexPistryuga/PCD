module org.example.lab1_pcd {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.lab1_pcd to javafx.fxml;
    exports org.example.lab1_pcd;
}