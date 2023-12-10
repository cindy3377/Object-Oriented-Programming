package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Currency;

public class CurrencyView {
    private Stage stage;
    private TextField amountField;
    private ChoiceBox<Currency> sourceCurrencyBox;
    private ChoiceBox<Currency> targetCurrencyBox;
    private Label resultLabel;
    private Button convertButton;


    public CurrencyView(Stage stage) {
        this.stage = stage;
        initialize();
    }

    private void initialize() {
        // Create UI components
        Label amountLabel = new Label("Amount:");
        amountField = new TextField();

        Label sourceLabel = new Label("Source Currency:");
        sourceCurrencyBox = new ChoiceBox<>();

        Label targetLabel = new Label("Target Currency:");
        targetCurrencyBox = new ChoiceBox<>();

        Button convertButton = new Button("Convert");

        resultLabel = new Label();

        // Layout
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(
                amountLabel, amountField,
                sourceLabel, sourceCurrencyBox,
                targetLabel, targetCurrencyBox,
                convertButton, resultLabel
        );

        // Set CSS style
        layout.getStylesheets().add("style.css");

        // Scene
        Scene scene = new Scene(layout, 300, 300);
        stage.setTitle("Currency Converter");
        stage.setScene(scene);
        stage.show();
    }

    public TextField getAmountField() {
        return amountField;
    }

    public ChoiceBox<Currency> getSourceCurrencyBox() {
        return sourceCurrencyBox;
    }

    public ChoiceBox<Currency> getTargetCurrencyBox() {
        return targetCurrencyBox;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public Stage getStage() {
        return stage;
    }

    public ButtonBase getConvertButton() {
        return convertButton;
    }
}
