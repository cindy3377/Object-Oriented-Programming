package entity;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CurrencyModel {
    // Hardcoded currencies for initial development
    public ObservableList<entity.Currency> currencies = FXCollections.observableArrayList(
            new entity.Currency("USD", "US Dollar", 1.0),
            new entity.Currency("EUR", "Euro", 0.85),
            new entity.Currency("GBP", "British Pound", 0.75),
            new entity.Currency("JPY", "Japanese Yen", 110.0),
            new entity.Currency("CAD", "Canadian Dollar", 1.25),
            new entity.Currency("AUD", "Australian Dollar", 1.3),
            new entity.Currency("CHF", "Swiss Franc", 0.9),
            new entity.Currency("CNY", "Chinese Yuan", 6.5),
            new entity.Currency("SEK", "Swedish Krona", 8.5),
            new entity.Currency("NZD", "New Zealand Dollar", 1.4),
            new entity.Currency("MXN", "Mexican Peso", 20.0),
            new entity.Currency("SGD", "Singapore Dollar", 1.4),
            new entity.Currency("HKD", "Hong Kong Dollar", 7.8),
            new entity.Currency("NOK", "Norwegian Krone", 8.5),
            new entity.Currency("KRW", "South Korean Won", 1100.0),
            new entity.Currency("TRY", "Turkish Lira", 7.5),
            new entity.Currency("RUB", "Russian Ruble", 75.0),
            new entity.Currency("INR", "Indian Rupee", 75.0),
            new entity.Currency("BRL", "Brazilian Real", 5.0),
            new entity.Currency("ZAR", "South African Rand", 15.0),
            new entity.Currency("TWD", "Taiwan New Dollar", 30.0),
            new entity.Currency("DKK", "Danish Krone", 6.5),
            new entity.Currency("PLN", "Polish Zloty", 4.0),
            new entity.Currency("THB", "Thai Baht", 30.0),
            new entity.Currency("IDR", "Indonesian Rupiah", 15000.0),
            new entity.Currency("HUF", "Hungarian Forint", 300.0),
            new entity.Currency("CZK", "Czech Koruna", 25.0),
            new entity.Currency("ILS", "Israeli Shekel", 3.5),
            new entity.Currency("CLP", "Chilean Peso", 750.0)
    );

    public CurrencyModel() {
    }

    public ObservableList<Currency> getCurrencies() {
        return currencies;
    }
}
