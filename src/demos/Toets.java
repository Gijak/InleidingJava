package demos;

import java.awt.*;
import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toets extends Applet {

    //Maken van een tekstvak, variable
    private TextField text;
    private boolean invoer;

    private int x, y, tijd, tijd1, tijd2, tijd3;

    public void init() {
        //Init Variables
        tijd = 0;
        invoer = false;
        x = 20;
        y = 70;
        //Init Knoppen
        Button knop1 = new Button("Toon Tijden");
        Listen1 l1 = new Listen1();
        knop1.addActionListener(l1);

        //Init tekstvak en label
        text = new TextField(20);
        Label label0 = new Label("Voer een uur in");

        //Voegt het toe in Applet
        add(label0);
        add(text);
        add(knop1);
    }
    public void paint(Graphics g) {
        //Het laat alleen zien als het knop is gedrukt
        if (invoer) {
            g.drawString("Tijd in Nederland is:" + tijd + ":00", x, y);
            g.drawString("Tijd in China is:" + tijd1 + ":00", x, y+20);
            g.drawString("Tijd in Mexico is:" + tijd2 + ":00", x, y+40);
            g.drawString("Tijd in Sirie is:" + tijd3 + ":00",x, y+60);

        }
    }
    private class Listen1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            tijd = Integer.parseInt(text.getText());
        // if en else condition
            if (tijd > -1 && tijd < 24) {
                tijd3 = tijd + 1;
                tijd2 = tijd - 7;
                tijd1 = tijd + 7;
                invoer = true;
            } else {
                invoer = false;
                text.setText("Ongeldige invoer");
            }

            if (tijd1 > 23 || tijd1 < 0) {
                tijd1 = tijd1 - 24;
            }
            if (tijd2 > 23 || tijd2 < 0) {
                tijd2 = tijd2 + 24;
            }
            if (tijd3 > 23 || tijd3 < 0) {
                tijd3 = tijd3 - 24;
            }
            repaint();
        }
    }
}