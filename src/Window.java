import javax.swing.*;
import java.awt.* ;
import java.awt.event.*;
import java.util.*;


public class Window extends JFrame implements ActionListener{
    //static protected ArrayList<Figure> liste = new ArrayList<Figure>("Rectanlge", "Carré", "Cercle", "Ellipse");
    //static protected Color c = Color.black;
    //static protected String nom = new String();

    static protected Drawing d = new Drawing();


    public Window(String titre, int x, int y){
        super(titre);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,200);
        this.setSize(500,250);

        this.setVisible(true);

        JMenuBar m = new JMenuBar();
        JMenu menu1 = new JMenu("Fichiers");
        JMenuItem ouvrir = new JMenuItem("Ouvrir") ;
        JMenuItem nouveau = new JMenuItem("Nouveau") ;
        JMenuItem enregistrer = new JMenuItem("Enregistrer") ;
        JMenuItem quitter = new JMenuItem("Quitter") ;
        menu1.add(ouvrir);
        menu1.add(nouveau);
        menu1.add(enregistrer);
        menu1.add(quitter);
        JMenu menu2 = new JMenu("A propos");
        JMenuItem auteurs = new JMenuItem("Auteurs") ;
        menu2.add(auteurs);
        m.add(menu1);
        m.add(menu2);
        ouvrir.addActionListener(this);
        enregistrer.addActionListener(this);
        nouveau.addActionListener(this);
        quitter.addActionListener(this);
        auteurs.addActionListener(this);

        Container pan = getContentPane() ;

        JPanel pan1 = new JPanel();
        JButton bouton1 = new JButton("Noir");
        bouton1.setBackground(Color.black);
        JButton bouton2 = new JButton("Magenta");
        bouton2.setBackground(Color.magenta);
        JButton bouton3 = new JButton("Vert");
        bouton3.setBackground(Color.green);
        JButton bouton4 = new JButton("Orange");
        bouton4.setBackground(Color.orange);
        JButton bouton5 = new JButton("Rouge");
        bouton5.setBackground(Color.red);
        JButton bouton6 = new JButton("Bleu");
        bouton6.setBackground(Color.blue);
        JButton bouton7 = new JButton("Jaune");
        bouton7.setBackground(Color.yellow);
        JButton bouton8 = new JButton("Rose");
        bouton8.setBackground(Color.pink);

        pan1.setLayout(new GridLayout(2,4));
        pan1.add(bouton1);
        pan1.add(bouton2);
        pan1.add(bouton3);
        pan1.add(bouton4);
        pan1.add(bouton5);
        pan1.add(bouton6);
        pan1.add(bouton7);
        pan1.add(bouton8);
        bouton1.addActionListener(this);
        bouton2.addActionListener(this);
        bouton3.addActionListener(this);
        bouton4.addActionListener(this);
        bouton5.addActionListener(this);
        bouton6.addActionListener(this);
        bouton7.addActionListener(this);
        bouton8.addActionListener(this);


        JPanel pan2 = new JPanel();
        JButton bouton21 = new JButton("Cercle");
        JButton bouton22 = new JButton("Ellipse");
        JButton bouton23 = new JButton("Rectangle");
        JButton bouton24 = new JButton("Carre");

        pan2.setLayout(new GridLayout(2,2));
        pan2.add(bouton21);
        pan2.add(bouton22);
        pan2.add(bouton23);
        pan2.add(bouton24);
        bouton21.addActionListener(this);
        bouton22.addActionListener(this);
        bouton23.addActionListener(this);
        bouton24.addActionListener(this);

        JPanel panneau = new JPanel();
        panneau.setLayout(new GridLayout(1,2));
        panneau.add(pan1);
        panneau.add(pan2);

        setJMenuBar(m);
        pan.add(new JTextArea(""),"Center");
        pan.add(panneau, "South");
        pan.add(d, "Center");

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();

        switch(cmd){
            case "Rouge" : d.setCouleur(Color.red);
                break;
            case "Magenta" : d.setCouleur(Color.magenta);
                break;
            case "Noir" : d.setCouleur(Color.black);
                break;
            case "Bleu" : d.setCouleur(Color.blue);
                break;
            case "Jaune" : d.setCouleur(Color.yellow);
                break;
            case "Rose" : d.setCouleur(Color.pink);
                break;
            case "Orange" : d.setCouleur(Color.orange);
                break;
            case "Carre" : d.setNomFig("Carre");
                break;
            case "Cercle" : d.setNomFig("Cercle");
                break;
            case "Rectangle" : d.setNomFig("Rectangle");
                break;
            case "Ellipse" : d.setNomFig("Ellipse");
                break;
            case "Nouveau" : d.efface();
                break;
            case "Vert" : d.setCouleur(Color.green);
                break;
            case "Auteurs" : JOptionPane jop = new JOptionPane();
                jop.showInternalMessageDialog(jop, "Auteurs : 2G2TD3", "information", JOptionPane.INFORMATION_MESSAGE);
                break;
            case "Quitter" : System.exit(0);
                break;
            default : System.out.println("Action : " + cmd);
                break;
        }
    }
}