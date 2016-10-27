package demos.H4;
import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Opdracht2 extends Applet {
    public void init(){
        setBackground(Color.white);
    }

public void paint(Graphics g){
    g.setColor(Color.blue);
    g.drawString("Gija", 50,60);
    g.setColor(Color.red);
    g.drawString("Kvantsjiani",50, 80);

    }

}
