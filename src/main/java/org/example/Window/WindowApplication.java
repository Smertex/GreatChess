package org.example.Window;

import javafx.application.Application;
import javafx.stage.Stage;

public class WindowApplication extends Application{
    public static void main(String[] args) {
        Application.launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Great chess");
        stage.setWidth(800);
        stage.setHeight(600);

        stage.show();
    }

}
