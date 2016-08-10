package bakkenTellerLukasDemeyere;

import javax.swing.*;


public class BakkenTeller {
    public static void main(String [ ] args) {
        int bak = 24;
        int i = 0;
        int aantal = 0;
        int totaal = 0;

        JFrame venster = new JFrame("Hoeveel mensen zijn er?");

        int personen = Integer.parseInt(JOptionPane.showInputDialog(venster, "Met hoeveel zijn jullie?"));

        while (i < personen) {
            aantal = Integer.parseInt(JOptionPane.showInputDialog(venster, "Hoeveel pinten zal persoon " + (i + 1) + " consumeren?"));
            if (aantal < 10){
                JOptionPane.showMessageDialog(venster, "dikke mini");
            }
            i++;

            totaal += aantal;
        }
        System.out.println(totaal);

        int eindtotal=(totaal/bak);
        if (eindtotal%bak==0) {
            eindtotal = eindtotal;
        }else{
            eindtotal += 1;
        }

        System.out.println(eindtotal);
        JOptionPane.showMessageDialog(venster, "Je zal " + eindtotal + " bakken nodig hebben." + "Er zullen " + totaal + " pinten gedronken worden");
    }
}
