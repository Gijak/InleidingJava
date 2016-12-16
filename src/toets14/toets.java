package toets14;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * Created by G_Kva on 16-12-2016.
 */

public class toets extends Applet{
    boolean win1;
    boolean win2;
    Button playknop;
    Button crediet;
    int krediet = 10;
    Image[] fotos = new Image[20];
    URL imagePad;
    private AudioClip sound;




    //worpen
    int worp1 = (int)(Math.random() * 20);
    int worp2 = (int)(Math.random() * 20);
    int worp3 = (int)(Math.random() * 20);




    public void init(){
        setSize(600,500);
        imagePad = toets.class.getResource("resources/");
        //geluid ophalen
        sound = getAudioClip(imagePad, "Casino.wav");
        //afbeelding ophalen
        for (int i= 0; i < fotos.length; i++) {
            fotos[i] = getImage(imagePad, "fruit_" + (i+1) + ".jpg");
        }



        win1 = false;
        playknop = new Button ("Speel");
        playknop.addActionListener ( new PlayknopListener());
        crediet = new Button ("Koop 10 kredietpunten");
        crediet.addActionListener ( new KredietListener());
        add(playknop);
        add(crediet);

    }

    public void paint (Graphics g){
        g.drawImage(fotos[worp1], 20, 80, this);
        g.drawImage(fotos[worp2], 120, 80, this);
        g.drawImage(fotos[worp3], 220, 80, this);
        g.drawString("Krediet " + krediet    , 30, 300);
        if (win1==true)
        {

            g.drawString("Gewonnen: 4 punten! "    , 30, 400);
            win1=false;
        }
        if (win2==true)
        {

            g.drawString("Gewonnen: 20 punten! "    , 30, 400);
            win2=false;
        }

    }
    class PlayknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            worp1 = (int)(Math.random() * 20);
            worp2 = (int)(Math.random() * 20);
            worp3 = (int)(Math.random() * 20);
            if (worp1 == worp2 || worp2 == worp3 || worp1 == worp3) {
                krediet+=4;
                win1=true;
                sound.play();

            }
            if (worp1 == worp2 && worp2 == worp3) {
                krediet+=20;
                win2=true;
                sound.play();
            }
            else if (krediet == 1) {
                playknop.setEnabled(false);
                crediet.setEnabled(true);
                krediet--;
            }
            else {krediet--;}

            repaint();


        }
    }

    class KredietListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            krediet = 10;
            playknop.setEnabled(true);
            crediet.setEnabled(false);
            repaint();



        }
    }
}
