import java.awt.*;

import javax.swing.*;

public class Login extends JFrame {

    Login() {

        setTitle("ATM");
        setLayout(null);
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("iconATM/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);

        JLabel label = new JLabel(img3);
        label.setBounds(90, 10, 100, 100);
        add(label);

        setSize(800, 400);
        setVisible(true);
        setLocation(350, 200);

    }

    public static void main(String args[]) {

        new Login();

    }
}