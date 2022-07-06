package MasterClass.Concurrency.JavaFx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;

public class Controller {

    private Task<ObservableList<String>> task;

    public void initialize() {
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);
                return FXCollections.observableArrayList(
                        "Andrey", "Bill", "Jack"
                );
            }
        };
    }

    @FXML
    public void buttonPressend(){

    }
}
