package interfaces;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Car();
        engine.acc();
        engine.start();
        engine.stop();

        Media media = new Car();
        media.start();

    }
}
