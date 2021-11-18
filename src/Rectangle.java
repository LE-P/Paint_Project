import java.awt.* ;
import java.awt.Color;


public class Rectangle extends Figure{
    protected int height;
    protected int width;

    public Rectangle( int px, int py,Color c){
        super( new Point (px,py), c);
        setBoundingBox(0,0);
    }

    @Override public void setBoundingBox(int heightBB, int widthBB) {
        this.height=heightBB;
        this.width=widthBB;

    }

    public Rectangle(Point p) {
        super (p);
        this.width = 0;
    }


    public Rectangle(int wi, int he) {
        super(new Point());
        width = wi;
        height = he;
    }



    @Override
    public String toString() {return "O : " +origin.toString()+ ", width = " +width+ ", height = " +height+ ".";}

    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillRect(origin.getpx(), origin.getpy(), this.width, this.height);
    }


    public String display() {
        String s = "+";
        for (int i =0; i<width; i++) {
            s=s+"--";
        }
        s+="+ \n";
        for (int j=0; j<height; j++) {
            s=s+"|";
            for (int i = 0; i<width; i++){
                s=s+ "  ";
            }
            s=s+ "| \n";
        }
        s=s+"+";
        for (int i =0; i<width; i++){
            s=s+"--";
        }
        s=s+"+";
        return (s);
    }
    public int getWidth(){return width;}
    public int getHeight(){return height;}
    public int getPerimeter(){return (2*(width+height));}
    public int getArea(){return (width*height);}

    //public void setHeight(int H){return height=H;}
    //public void setWidth(int W){return width=W;}
}