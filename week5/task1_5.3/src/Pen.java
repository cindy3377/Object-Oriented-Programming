public class Pen {
    public enum Color {
        RED("red"), GREEN("green"), BLUE("blue");
        private final String color;

        Color(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return color;
        }
    }

    private Color currentColor;
    private boolean capOn = true;

    public Pen() {
        this.currentColor = Color.RED;
    }

    public Pen(Color initialColor) {
        this.currentColor = initialColor;
    }

    public String draw() {
        if (capOn) {
            return "";
        } else {
            return "Drawing " + currentColor.toString();
        }
    }

    public void capOn() {
        capOn = true;
    }

    public void capOff() {
        capOn = false;
    }

    public void changeColor(Color newColor) {
        if (capOn) {
            currentColor = newColor;
        }
    }

    public static void main(String[] args) {
        Pen defaultPen = new Pen();

        System.out.println(defaultPen.draw());

        defaultPen.capOff();
        System.out.println(defaultPen.draw());

        defaultPen.changeColor(Pen.Color.GREEN);

        System.out.println(defaultPen.draw());

        defaultPen.capOn();
        System.out.println(defaultPen.draw());

        Pen bluePen = new Pen(Pen.Color.BLUE);

        System.out.println(bluePen.draw());
    }
}