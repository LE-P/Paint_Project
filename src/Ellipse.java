import java.awt.*;

public class Ellipse extends Figure{
    protected int gaxe;
    protected int paxe;

    public Ellipse(Point p) {
        super (p);
        this.paxe = 0;
        this.gaxe = 0;
    }
    public Ellipse (int ga, int pa){
        super(new Point());
        gaxe= ga;
        paxe= pa;
    }

    public Ellipse (int px, int py, Color c){
        super( new Point(px, py),c);
        this.paxe = 0;
        this.gaxe = 0;
    }

    public void draw(Graphics g) {
        g.setColor(this.c);
        g.fillOval(origin.getpx(), origin.getpy(), this.paxe, this.gaxe);
    }

    @Override public void setBoundingBox(int heightBB, int widthBB) {
        this.paxe=heightBB;
        this.gaxe=widthBB;
    }

    public int getArea() {return (int) (Math.PI*gaxe*paxe/4);}
    public int getPerimeter() {
        return (int) (2*Math.PI*Math.sqrt(((paxe*paxe)+(gaxe*gaxe))/2));
    }
    public int getGrandAxe() {
        return gaxe;
    }
    public int getPetitAxe() {
        return paxe;
    }
}
