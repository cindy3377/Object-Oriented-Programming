package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyDao {
    private final Connection connection; // Initialize this in the constructor

    // Constructor to receive a database connection
    public CurrencyDao(Connection connection) {
        this.connection = connection;
    }

    // Method to get exchange rate for a currency abbreviation
    public double getExchangeRate(String currencyAbbreviation) {
        // Implement the logic to fetch exchange rate from the database
        String sql = "SELECT rate FROM currency_table WHERE abbreviation = ?";

        // Use a PreparedStatement to avoid SQL injection
        // Return the exchange rate as a double
        // Handle exceptions gracefully
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, currencyAbbreviation);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getDouble("rate");
                } else {
                    // Handle the case where the currency abbreviation is not found
                    return 0.0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0.0; // Placeholder, replace with actual logic
        }
    }
}


