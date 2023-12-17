package application;
import entity.*;
import dao.*;

public class Main  {
    public static void main(String[] args) {
        ;
    }
    public static void test() {
        CurrencyDAO currencyDAO = new CurrencyDAO();
        Currency currency = new Currency("VND", "Vietnam Dong", 24000.0);
        currencyDAO.save(currency);
        System.out.println(currencyDAO.findAll());
        System.out.println(currencyDAO.findByAbbreviation("VND"));
        System.out.println(currencyDAO.findByName("Vietnam Dong"));
        currencyDAO.delete(currency);
        System.out.println(currencyDAO.findAll());
    }
}


