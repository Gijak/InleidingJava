package Hoofdstuk11;

/**
 * Created by G_Kva on 2-11-2016.
 */

        import java.applet.*;
        import java.awt.*;

@SuppressWarnings("serial")
public class Opdr8 extends Applet
{
    public void paint (Graphics g)
    {
        int i = 0;
        int x = 50;
        int y = 50;
        int width = 10;
        int height = 10;
        while (i < 101)
        {

            g.drawOval(x, y, width, height);
            x += 0;
            y += 0;
            width += 10;
            height += 10;
            i++;


        }
    }
}