package Hoofdstuk11;

/**
 * Created by G_Kva on 2-11-2016.
 */

        import java.applet.Applet;
        import java.awt.Graphics;

public class Opdr4 extends Applet
{
    public void paint(Graphics g)
    {
        int x = 45;
        int y = 20;
        for (int i = 3; i < 33; i+=3 )
        {
            g.drawString(""+i, x, y);
            x += 20;
        }


    }
}