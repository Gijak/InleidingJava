package Hoofdstuk11;

/**
 * Created by G_Kva on 2-11-2016.
 */

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings("serial")
public class Opdr7 extends Applet {

    public void paint (Graphics g)
    {
        int i = 0;
        int x = 300;
        int y = 300;
        int width = 10;
        int height = 10;
        while (i < 51)
        {
            g.drawOval(x, y, width, height);
            width += 10;
            x -= 5;
            y -= 5;
            height += 10;
            i++;
        }
    }
}