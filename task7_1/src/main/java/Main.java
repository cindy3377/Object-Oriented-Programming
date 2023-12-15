import control.CurrencyController;
import javafx.application.Application;
import javafx.stage.Stage;
import model.CurrencyModel;
import view.CurrencyView;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        CurrencyModel model = new CurrencyModel();
        CurrencyView view = new CurrencyView(primaryStage);
        CurrencyController controller = new CurrencyController(model, view);
    }
}
