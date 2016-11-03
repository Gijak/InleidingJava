package Hoofdstuk11;

/**
 * Created by G_Kva on 2-11-2016.
 */

        import java.applet.*;
        import java.awt.*;

@SuppressWarnings("serial")
public class Opdr9 extends Applet
{
    public void paint(Graphics g)
    {
        int x = 60;
        int y = 60;
        int width = 20;
        int height = 20;
        for (int a = 0; a<8; a++)
        {
            for (int b = 0; b < 8; b++ )
            {

                if ((a+b) %2 != 0)
                {
                    g.drawRect(x, y, width, height);
                }
                else
                {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, width, height);
                    g.drawRect(x, y, width, height);
                }
                x+= width;

            }
            x = 60;
            y +=height;
        }

    }
}