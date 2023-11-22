public class Clock {
    private static Clock instance;
    private int time;

    // Private constructor prevents direct instantiation
    private Clock() {
        time = 0;
    }

    // Static method to provide the singleton instance
    public static Clock getInstance() {
        if (instance == null) {
            instance = new Clock();
        }
        return instance;
    }

    // Get current time
    public int getTime() {
        return time;
    }

    // Set new time
    public void setTime(int newTime) {
        time = newTime;
    }
}


