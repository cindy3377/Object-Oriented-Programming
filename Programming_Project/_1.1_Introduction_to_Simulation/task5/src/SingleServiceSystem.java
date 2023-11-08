public class SingleServiceSystem {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        int numCustomers = 5;
        CustomerGenerator.generateCustomers(servicePoint, numCustomers);
        servicePoint.serve();
    }
}