package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Praktijkopdracht extends Applet {
    public void init(){}

    public void paint(Graphics g){
        g.drawLine(20,10,250,10);
        g.drawString("Lijn",125,25);
        g.drawRect(20,30,225,90);
        g.drawString("Rechthoek",100,132);
        g.drawRoundRect(20,140,225,100,20,20);
        g.drawString("Afgeronde rechthoek",80,252);
        g.setColor(Color.magenta);
        g.fillArc(550,30,100,50,0,45);
        g.fillOval(255,140,225,100);
        g.fillRect(255,30,225,90);
        g.setColor(Color.black);
        g.drawOval(550,30,100,50);
        g.drawOval(255,30,225,90);
        g.drawString("Gevuld ovaal",330,255);
        g.drawString("Gevulde rechthoek met ovaal",290,132);
        g.drawString("Taartpunt met ovaal eromheen",520,95);
        g.drawOval(540,130,120,120);
        g.drawString("Cirkel",575,260);
    }
}
