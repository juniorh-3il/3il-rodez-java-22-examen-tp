package juniorh.gui;

import javax.swing.*;

public class InputForm extends JPanel {
    private JLabel labelTitre;
    private JTextArea champTitre;
    private JLabel labelDescription;
    private JTextArea champDescription;
    private JLabel labelDateEcheance;
    private JTextArea champDateEchanceJour;
    private JTextArea champDateEchanceMois;
    private JTextArea champDateEchanceAnnee;
    private JButton boutonAjouter;

    public InputForm() {
        super();
        this.labelTitre = new JLabel("Titre");
        this.champTitre = new JTextArea("Manger du canard");
        this.labelDescription = new JLabel("Description");
        this.champDescription = new JTextArea("Acheter du Canard, le plumer et le cuire");
        this.labelDateEcheance = new JLabel("Date échéance");
        this.champDateEchanceJour = new JTextArea("14");
        this.champDateEchanceMois = new JTextArea("7");
        this.champDateEchanceAnnee = new JTextArea("2024");
        this.boutonAjouter = new JButton("Ajouter");
        this.add(this.labelTitre);
        this.add(this.champTitre);
        this.add(this.labelDescription);
        this.add(this.champDescription);
        this.add(this.labelDateEcheance);
        this.add(this.champDateEchanceJour);
        this.add(this.champDateEchanceMois);
        this.add(this.champDateEchanceAnnee);
        this.add(this.boutonAjouter);
    }

}
