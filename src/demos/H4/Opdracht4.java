package demos.H4;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Opdracht4 extends Applet {

    public void init(){

    }

    public void paint (Graphics g){
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawRect(20,20,100,50);
        g.fillRect(20,80,100,50);
    }
}
