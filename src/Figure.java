import java.awt.* ;
import java.awt.Color;

public abstract class Figure {
    protected Point origin;
    protected Color c;
   // protected int heightBB;
   // protected int widthBB;

    public Figure(Point p,Color c){
        this.c=c;
        this.origin=p;
    }
    public Figure(Point p0)  {
        origin = p0;
    }

    public Color getColor(){return c;}
    public Point getPoint(){return origin;}


    @Override
    public String toString() {return "color: "+this.c+", origin: "+origin;}


    public abstract void draw(Graphics g);
    public abstract int getArea();
    public abstract int getPerimeter();

    public abstract void setBoundingBox (int heightBB, int widthBB);

}
