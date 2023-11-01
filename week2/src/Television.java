public class Television {
    private boolean on;
    private int channel;

    public Television() {
        this.on = false;
        this.channel = 1;
    }

    public void pressOnOff() {
        this.on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }
}
