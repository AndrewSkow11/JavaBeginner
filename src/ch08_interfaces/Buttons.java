package ch08_interfaces;

import javax.swing.*;


public class Buttons extends JFrame {

    JPanel pn1 = new JPanel();




//    ClassLoader ldr = this.getClass().getClassLoader();
//    java.net.URL ticketURL = ldr.getResource("tick.png");
//    java.net.URL crossURL = ldr.getResource("cross.png");
//
//    ImageIcon tick = new ImageIcon(ticketURL);
//    ImageIcon cross = new ImageIcon(crossURL);

    JButton btn = new JButton("Нажми меня");
    JButton tickBtn = new JButton("Картинка tick png");
    JButton crossBtn = new JButton("Картинка cross.png");




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

    public static void main(String[] args) {
        Buttons gui = new Buttons();
    }



}
