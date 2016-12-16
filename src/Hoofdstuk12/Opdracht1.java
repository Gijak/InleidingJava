package Hoofdstuk12;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

/**
 * Created by G_Kva on 3-11-2016.
 */
public class Opdracht1 extends Applet {
    TextField[] tekstvelden;
    int[] getallen;
    Button knop;

    @Override
    public void init (){

        tekstvelden = new TextField[5];
        getallen = new int[5];

        for (int i = 0; i < tekstvelden.length; i++){
            tekstvelden[i] = new TextField("",5);
            add(tekstvelden[i]);
        }
        knop = new Button("Ok");
        add(knop);
        knop.addActionListener(new KnopListener());
    }


    class KnopListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i< tekstvelden.length; i++){
                String invoer = tekstvelden[i].getText();
                getallen[i] = Integer.parseInt(invoer);
            }
            Arrays.sort(getallen);

            for (int i = 0; 1<getallen.length; i++){
                tekstvelden[i].setText(String.valueOf(getallen[i]));
            }
        }
    }
}
