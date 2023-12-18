package entity;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CurrencyModel {
    private ObservableList<Currency> currencies = FXCollections.observableArrayList();

    public CurrencyModel() {
        // Load currencies from the database or any other external source
        // Instead of hardcoding, you can fetch currencies from the database using CurrencyDAO
        // Example: currencies = currencyDao.findAll();
    }

    public ObservableList<Currency> getCurrencies() {
        return currencies;
    }
}
