package Övningsuppgift7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Oscar Norman <br>
 * Date: 2020-10-21   <br>
 * Time: 09:45   <br>
 * Project: Sprint 3 <br>
 */
public class Main extends JFrame {

    JButton button = new JButton("Button");
    JPanel panel = new JPanel();


    Main() {
        add(panel);
        panel.add(button);

        MouseAdapter ma = new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button.setBackground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button.setBackground(null);
            }
        };

        button.addMouseListener(ma);
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setVisible(true);

    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
