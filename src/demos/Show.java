package demos;

/**
 * Created by Gija on 6-10-2016.
 */
//importeer de benodigde klassen uit de Java bibliotheek
import java .awt.*;
import java. applet.*;


//een klasse met de naam Show van het type Applet
public class Show extends Applet {
    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(new Color(255,248, 220));
    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(new Color(128, 0, 0));
        g.drawString("Mijn eerste Applet", 50, 70);
    }
}
