package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Stoplicht extends Applet {

    public void init() {
        setBackground(Color.lightGray);

    }
    public void paint (Graphics g) {

        g.fillRoundRect(50, 50, 45, 150, 5, 5);
        g.fillRect(65, 50, 15, 200);
        g.setColor(Color.green);
        g.fillOval(60,60,30,30);
        g.setColor(Color.red);
        g.fillOval(60,110,30,30);
        g.setColor(Color.ORANGE);
        g.fillOval(60,160,30,30);


    }
}
