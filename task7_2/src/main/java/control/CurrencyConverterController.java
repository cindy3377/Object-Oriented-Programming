package control;

import dao.CurrencyDao;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import entity.Currency;
import entity.CurrencyModel;
import view.CurrencyConverterView;


public class CurrencyConverterController {
    private final CurrencyConverterView view;
    private final CurrencyDao currencyDao;


    public CurrencyConverterController(CurrencyModel model, CurrencyConverterView view, CurrencyDao currencyDao){
        this.view = view;
        this.currencyDao = currencyDao;

        // Set choices for currency boxes
        view.getSourceCurrencyBox().setItems(model.getCurrencies());
        view.getTargetCurrencyBox().setItems(model.getCurrencies());

        // Set event handler for the Convert button
        ConvertButtonHandler handler = new ConvertButtonHandler();
        view.getConvertButton().setOnAction(handler);
    }

    // Event handler for the Convert button
    private class ConvertButtonHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            try {
                double amount = Double.parseDouble(view.getAmountField().getText());
                // Get exchange rates from the database using CurrencyDao
                Currency sourceCurrency = view.getSourceCurrencyBox().getValue();
                Currency targetCurrency = view.getTargetCurrencyBox().getValue();

                // Calculate the conversion result
                double result = amount * targetCurrency.getRate() / sourceCurrency.getRate();

                // Display the result
                view.getResultLabel().setText(String.format("%.2f %s", result, targetCurrency.getAbbreviation()));
            } catch (NumberFormatException e) {
                // Display an error message
                view.getResultLabel().setText("Invalid amount entered");
            }
        }
    }
}
