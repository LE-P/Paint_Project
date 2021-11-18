import java.awt.Color;

public class Circle extends Ellipse{
    public Circle(int c){

        super(c, c);
    }

    public Circle(int px, int py, Color c){

        super(px, py, c);
    }

    public void setWidth(int cote){
        super.gaxe = cote;
        super.paxe = cote;
    }
    public void setHeight(int cote){
        super.gaxe = cote;
        super.paxe = cote;
    }

    @Override public void setBoundingBox(int heightBB, int widthBB) {
        this.paxe=heightBB;
        this.gaxe=widthBB;
    }

}
