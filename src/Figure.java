import java.awt.Graphics;
import java.awt.Color;

public abstract class Figure {
    private Point p;
    private Color c;
    protected int heightBB;
    protected int widthBB;

    public Figure(Color c, Point a){
        this.c=c;
        this.p=p;
    }

    public Color getColor(){return c;}
    public Point getPoint(){return p;}


    @Override
    public String toString() {return "couleur: "+this.c+", origine: "+p;}

    public abstract void setBoundingBox (int heightBB, int widthBB);
    public abstract void draw (Graphics g);
}
