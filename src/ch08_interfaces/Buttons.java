package ch08_interfaces;

import javax.swing.*;


public class Buttons extends JFrame {

    JPanel pn1 = new JPanel();

    public static void main(String[] args) {
        Buttons gui = new Buttons();
    }


    ImageIcon tick = new ImageIcon("tuck.png");
    ImageIcon cross = new ImageIcon("cross.png");

    JButton btn = new JButton("Нажми меня");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("Стоп", cross);


    public Buttons() {
        super("Окно Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pn1);
        setVisible(true);
        pn1.add(btn);
        pn1.add(tickBtn);
        pn1.add(crossBtn);
    }

}
