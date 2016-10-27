package demos;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Gija on 6-10-2016.
 */
public class CijfersInvoeren extends Applet {

    TextField tekstveld;
    Button knop;


    double invoer;
    double totaal;

    double gemiddelde;

    int aantalCijfers;

    boolean geklikt;


    @Override
    public void init() {
        super.init();
        tekstveld = new TextField("", 5);
        add(tekstveld);

        knop = new Button("Ok");
        add(knop);
        KnopLuisteraar kl = new KnopLuisteraar();
        knop.addActionListener(kl);

    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        int x = 50;
        int y = 80;

        if (geklikt) {
            if (invoer < 5.5) {
                g.drawString("Het cijfer is onvoldoende", x, y);
            } else {
                g.drawString("Het cijfer is voldoende", x, y);
            }


            y = y + 20;
            g.drawString("Gemiddelde" + gemiddelde, x, y);
        }
    }

    class KnopLuisteraar implements ActionListener {


        public void actionPerformed(ActiveEvent e) {
            String s = tekstveld.getText();
            invoer = Double.parseDouble(s);

            totaal = totaal + invoer;
            aantalCijfers++;

            gemiddelde = totaal / aantalCijfers;

            geklikt = true;


        }

        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }

}
