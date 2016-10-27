package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Driehoek extends Applet {
    public void paint (Graphics g){
        g.drawLine(50,120,100,50);
        g.drawLine(50,120,150,120);
        g.drawLine(100,50,150,120);
    }
}
