package Hoofdstuk11;

/**
 * Created by G_Kva on 2-11-2016.
 */

        import java.applet.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class PraktijkOpdr2 extends Applet
{
    Button ok;
    int i, t, y, x;

    public void init()
    {
        i = 0;
        t = 0;
        ok = new Button("OK");
        Listen1 l = new Listen1();
        ok.addActionListener(l);
        add(ok);
    }

    public void paint(Graphics g)
    {
        x=60;
        y=60;
        if (i>0 && i<11)
        {
            for(t=0; t<10;)
            {
                t++;
                y=y+10;
                g.drawString(t+"x"+i+"="+i*t, x, y);
            }
        }
        else if (i>10)
        {
            i=0;
        }
    }
    class Listen1 implements ActionListener
    {
        public void actionPerformed( ActionEvent e){
            i++;
            repaint();
        }
    }
}