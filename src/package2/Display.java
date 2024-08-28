package package2;
import javax.swing.JFrame;

public class Display {

    public static void main(String[] args) {
        Client client1 = new Client();
        client1.setVisible(true);
        client1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Client client2 = new Client();
        client2.setVisible(true);
        client2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Client client3 = new Client();
        client3.setVisible(true);
        client3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ServerFrame ServerFrame = new ServerFrame();
        ServerFrame.setVisible(true);
        ServerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
