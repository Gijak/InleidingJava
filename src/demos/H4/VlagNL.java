package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class VlagNL extends Applet {
    public void init(){
        setBackground(Color.gray);
    }

    public void paint(Graphics g){
        g.setColor(Color.red);
        g.drawRect(120,70,90,25);
        g.fillRect(120,70,90,25);
        g.setColor(Color.white);
        g.drawRect(120,95,90,25);
        g.fillRect(120,95,90,25);
        g.setColor(Color.BLUE);
        g.drawRect(120,120,90,25);
        g.fillRect(120,120,90,25);
        g.setColor(Color.black);
        g.drawRect(115,70,5,120);
        g.fillRect(115,70,5,120);
    }
}
