package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Dobbelsteen extends Applet {
    public void init(){}

    public void paint(Graphics g){
        g.drawRoundRect(20,20,50,50,10,10);
        g.fillOval(55,55,5,5);
        g.fillOval(55,25,5,5);
        g.fillOval(25,25,5,5);
        g.fillOval(25,55,5,5);
        g.fillOval(40,40,5,5);
    }

}
