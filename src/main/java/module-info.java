module c5_sae.c5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens c5_sae.c5 to javafx.fxml;
    exports c5_sae.c5;
    exports c5_sae.c5.util;
    opens c5_sae.c5.util to javafx.fxml;
    exports c5_sae.c5.ihm;
    opens c5_sae.c5.ihm to javafx.fxml;
}