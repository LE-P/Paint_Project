import java.awt.Color;

public class Cercle extends Ellipse{
    public Cercle(int c){

        super(c, c);
    }

    public Cercle (int px, int py, Color c){

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
