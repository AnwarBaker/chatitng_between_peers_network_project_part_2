package package2;

public class Receive implements Runnable {
    private Client client;

    public Receive(Client client) {
        this.client = client;
    }

    @Override
    public void run() {
        while (true) {
            client.receive();
        }
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }
}
