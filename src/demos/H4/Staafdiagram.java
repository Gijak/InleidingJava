package demos.H4;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Gija on 7-10-2016.
 */
public class Staafdiagram extends Applet {

    public void init(){
    }
    public void paint (Graphics g){
        g.drawLine(20,20,20,220);
        g.drawLine(20,220,160,220);
        g.drawString("0",10,220);
        g.drawString("20",5,180);
        g.drawString("40",5,140);
        g.drawString("60",5,100);
        g.drawString("80",5,60);
        g.drawString("100",3,20);
        g.setColor(Color.red);
        g.drawString("Valerie",30,240);
        g.fillRect(30,20,20,200);
        g.setColor(Color.green);
        g.drawString("Jeroen",80,240);
        g.fillRect(80,60,20,160);
        g.setColor(Color.BLUE);
        g.drawString("Hans",130,240);
        g.fillRect(130,100,20,120);



    }
}
