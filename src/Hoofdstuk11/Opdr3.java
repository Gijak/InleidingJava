package Hoofdstuk11;

/**
 * Created by G_Kva on 2-11-2016.
 */

        import java.applet.Applet;
        import java.awt.Graphics;

@SuppressWarnings("serial")
public class Opdr3 extends Applet
{
    public void paint(Graphics g)
    {
        int x = 50;
        int y = 30;
        int z = 1;
        for (int i = 1; i < 30; i+=z )
        {
            g.drawString(""+i, x, y);
            x += 20;
            z ++;
        }


    }
}