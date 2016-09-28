package Hoofdstuk8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Rekenmachine extends Applet{

    TextField vak1;
    TextField vak2;
    Button keerKnoop;
    Button deelKnoop;
    Button minKnoop;
    Button plusKnoop;
    Button resetKnoop;

    double getal1;
    double getal2;
    double uitkomst;

    @Override
    public void init(){
        super.init();
        vak1 = new TextField("", 20);
        add (vak1);

        vak2 = new TextField("", 20 );
        add (vak2);

        keerKnoop = new Button("X");
        add (keerKnoop);
        KeerKnoopListener kkl = new KeerKnoopListener();
        keerKnoop.addActionListener(kkl);

        deelKnoop = new Button ("/");
        add (deelKnoop);
        DeelKnoopListener dkl = new DeelKnoopListener();
        deelKnoop.addActionListener(dkl);

        minKnoop = new Button("-");
        add (minKnoop);
        MinKnoopListener mkl = new MinKnoopListener();
        minKnoop.addActionListener(mkl);

        plusKnoop = new Button("+");
        add (plusKnoop);
        PlusKnoopListener pkl = new PlusKnoopListener();
        plusKnoop.addActionListener(pkl);

        resetKnoop = new Button("Reset");
        add (resetKnoop);
        ResetKnoopListener rkl = new ResetKnoopListener();
        resetKnoop.addActionListener(rkl);


    }

    class KeerKnoopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 * getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }
    class DeelKnoopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 / getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }
    class MinKnoopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 - getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }
    class PlusKnoopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            getal1 = Double.parseDouble(vak1.getText());
            getal2 = Double.parseDouble(vak2.getText());
            uitkomst = getal1 + getal2;

            vak1.setText("" + uitkomst);
            vak2.setText("");

        }
    }    class ResetKnoopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            vak1.setText("");
            vak2.setText("");

        }
    }


}
