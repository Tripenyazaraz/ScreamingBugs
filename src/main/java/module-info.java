module com.tripenyazaraz.screamingbugs.fx {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.tripenyazaraz.screamingbugs.fx;
    opens com.tripenyazaraz.screamingbugs.fx to javafx.fxml;
}