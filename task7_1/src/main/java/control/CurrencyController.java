package control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.CurrencyModel;
import view.CurrencyView;

import java.util.Currency;

public class CurrencyController {
    private final CurrencyModel model;
    private final CurrencyView view;

    public CurrencyController(CurrencyModel model, CurrencyView view) {
        this.model = model;
        this.view = view;

        // Set choices for currency boxes
        view.getSourceCurrencyBox().setItems(model.getCurrencies());
        view.getTargetCurrencyBox().setItems(model.getCurrencies());

        // Set event handler for the Convert button
        view.getConvertButton().setOnAction(new ConvertButtonHandler());
    }

    // Event handler for the Convert button
    private class ConvertButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            try {
                double amount = Double.parseDouble(view.getAmountField().getText());
                Currency sourceCurrency = view.getSourceCurrencyBox().getValue();
                Currency targetCurrency = view.getTargetCurrencyBox().getValue();

                // Calculate the conversion result
                double result = (amount * targetCurrency.getClass()) / sourceCurrency.getClass();

                // Display the result
                //view.getResultLabel().setText(String.format("%.2f %s", result, targetCurrency.getAbbreviation()));
            } catch (NumberFormatException e) {
                // Handle invalid input
                showErrorMessage("Invalid input. Please enter a valid number.");
            } catch (NullPointerException e) {
                // Handle missing currency selection
                showErrorMessage("Please select source and target currencies.");
            }
        }

        // Helper method to display error messages
        private void showErrorMessage(String message) {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText(message);
            alert.showAndWait();
        }
    }
}
