package application;
import entity.*;
import dao.*;



public class Main  {
    public static void main(String[] args) {
        CurrencyDao currencydao = new CurrencyDao();
        TransactionDao transdao = new TransactionDao();

        Transaction t1 = new Transaction(1, "Travelling");
        Transaction t2 = new Transaction(2, "Groceries");
        Transaction t3 = new Transaction(3, "Entertainment");
        Transaction t4 = new Transaction(4, "Healthcare");
        Transaction t5 = new Transaction(5, "Other");

        transdao.persist(t1);
        transdao.persist(t2);
        transdao.persist(t3);
        transdao.persist(t4);
        transdao.persist(t5);

        currencydao.persist(new Currency("USD", "US Dollar", 1.0, t1));
        currencydao.persist(new Currency("GBP", "British Pound", 0.72, t2));
        currencydao.persist(new Currency("EUR", "Euro", 0.83, t3));
        currencydao.persist(new Currency("JPY", "Japanese Yen", 109.84, t4));
        currencydao.persist(new Currency("CNY", "Chinese Yuan", 6.47, t5));

        Currency curr = currencydao.find(1);
        System.out.println(curr.getName() + " " + curr.getAbbreviation() + " " + curr.getRate() + " " + curr.getTransaction());
    }
}


