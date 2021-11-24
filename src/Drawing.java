import java.util.*;
import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Drawing extends JPanel implements MouseListener, MouseMotionListener{
    protected ArrayList<Figure> liste;
    protected Color c;
    protected String nomFigure;
    protected int x;
    protected int y;

    public Drawing(){
        super();
        this.c = Color.black;
        this.nomFigure = "Rectangle";
       this.liste = new ArrayList<Figure>();
       this.addMouseListener(this);
       this.addMouseMotionListener(this);
     }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        this.setBackground(Color.white);
        for(Figure f : liste){
            f.draw(g);
        }
    }

    public void setCouleur(Color cl){
        this.c = cl;
    }

    public void setNomFig(String nomFig){
        this.nomFigure = nomFig;
    }

    public void setListe(ArrayList<Figure> l){
        this.liste = l;
    }

    public void mouseDragged(MouseEvent e){
        liste.get(liste.size()-1).setBoundingBox(e.getX()-x, e.getY()-y);
        paintComponent(this.getGraphics());
    }
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){
        x = e.getX();
        y = e.getY();
        switch(nomFigure) {
            case "Ellipse" : liste.add(new Ellipse(x, y, c));
                break;
            case "Carre" : liste.add(new Square(x, y, c));
                break;
            case "Cercle" : liste.add(new Circle(x, y, c));
                break;
            case "Rectangle" : liste.add(new Rectangle(x, y, c));
                break;
        }
    }
    public void mouseReleased(MouseEvent e){
        liste.get(liste.size()-1).setBoundingBox(e.getX()-x, e.getY()-y);
        paintComponent(this.getGraphics());

    }

    public void efface() {
        liste.clear();
        super.paintComponent(this.getGraphics());
    }

    public Color getCouleur(){
    return this.c;
    }

    public String getNomFig(){
    return this.nomFigure;
    }

    public ArrayList<Figure> getListe(){
        return this.liste;
    }

}