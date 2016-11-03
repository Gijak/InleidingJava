package Hoofdstuk11;

import java.applet.*;
import java.awt.*;


@SuppressWarnings("serial")

public class PraktijkOpdr1 extends Applet
{
    public void paint(Graphics g)
    {

    int x = 50;
    int y = 50;
    int breedteVeld = 20;
    int hoogteVeld = 20;
    for (int a = 0; a<8; a++ )
    {
        for (int b = 0; b < 8; b++ )
        {

            if ((a+b) %2 !=0)
            {
                g.drawRect(x,y,breedteVeld,hoogteVeld);
            }
            else
            {
                g.setColor(Color.BLACK);
                g.fillRect(x, y, breedteVeld, hoogteVeld);
                g.drawRect(x, y, breedteVeld, hoogteVeld);
            }
            x+=breedteVeld;
        }
        x = 50;
        y += hoogteVeld;

        }
    }
}