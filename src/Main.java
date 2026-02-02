import javax.swing.*;
import java.awt.*;


public class Main extends JFrame {
        CardLayout cardLayout = new CardLayout();
        //Hosts cardLayout
        JPanel hostPanel = new JPanel(cardLayout);
        //Home Page
        JPanel home = new JPanel();
        //Not the home page (placeholder)
        JPanel notHome = new JPanel();
        //For Testing
        JButton button = new JButton("Switch Cards1");
        JButton button2 = new JButton("Switch Cards2");

        Main() {
            home.setBackground(Color.BLUE);
            notHome.setBackground(Color.RED);

            home.add(button);
            notHome.add(button2);

            hostPanel.add(home, "Home");
            hostPanel.add(notHome, "Not Home");

            button.addActionListener((_) -> cardLayout.show(hostPanel, "Not Home"));
            button2.addActionListener((_) -> cardLayout.show(hostPanel, "Home"));

            add(hostPanel);
            setSize(300,300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
    public static void main(String[] args) {
        new Main();
    }
}
