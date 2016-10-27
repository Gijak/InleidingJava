package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Ellips extends Applet {
    public void init(){
        setBackground(Color.BLUE);
    }
    public void paint (Graphics g){
        g.drawOval(40,40,120,80);
        g.setColor(Color.yellow);
        g.fillArc(40,40,120,80,90,45);
    }
}
