package application;

import control.CurrencyConverterController;
import dao.CurrencyDao;
import entity.CurrencyModel;
import javafx.application.Application;
import javafx.stage.Stage;
import view.CurrencyConverterView;

import java.sql.Connection;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Initialize your database connection
        Connection connection = null /* Initialize your database connection */;

        // Create a CurrencyDao instance with the database connection
        CurrencyDao currencyDao = new CurrencyDao(connection);

        // Create a CurrencyModel instance (you may need to adjust this based on your implementation)
        CurrencyModel currencyModel = new CurrencyModel();

        // Create a CurrencyConverterView instance
        CurrencyConverterView currencyConverterView = new CurrencyConverterView(primaryStage);

        // Create a CurrencyConverterController instance with CurrencyDao
        CurrencyConverterController controller = new CurrencyConverterController(currencyModel, currencyConverterView, currencyDao);

        primaryStage.setScene(currencyConverterView.getScene());
        primaryStage.setTitle("Currency Converter");
        primaryStage.show();
    }
}
