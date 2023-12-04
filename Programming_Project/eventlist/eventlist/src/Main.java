public class Main {
    public static void main(String[] args) {
        System.out.println("Simulator\n");

        Engine engine = new MyEngine();
        engine.setSimulationTime(100);
        engine.run();
    }
}
