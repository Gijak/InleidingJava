package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Huis extends Applet {
    public void paint(Graphics g){
        g.drawLine(50, 120, 150, 120);
        g.drawLine(50, 120, 100, 50);
        g.drawLine(100, 50, 150, 120);
        g.drawRect(60,160,20,40);
        g.drawRect(50,120,100,80);
        g.drawRect(110,160,25,25);
    }
}

