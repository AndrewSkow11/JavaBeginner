package ch08_interfaces;

import javax.swing.*;

public class Window extends JFrame{

    JPanel pn1 = new JPanel();

    public static void main(String[] args) {
        Window gui = new Window();
    }

    public Window() {
        super("Окно Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pn1);
        setVisible(true);
    }
}
