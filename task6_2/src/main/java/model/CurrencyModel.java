package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Currency;

public class CurrencyModel {
    // Hardcoded currencies for initial development
    private final ObservableList<Currency> currencies = FXCollections.observableArrayList(
            new Currency("USD", "US Dollar", 1.0),
            new Currency("EUR", "Euro", 0.85),
            new Currency("GBP", "British Pound", 0.75)
            // Add more currencies as needed
    );

    public CurrencyModel() {
    }

    public ObservableList<Currency> getCurrencies() {
        return currencies;
    }
}
