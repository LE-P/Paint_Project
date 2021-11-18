import java.awt.Color;

public class Carre extends Rectangle {

    public Carre(int c){
        super(c, c);
    }

    public Carre (int px, int py, Color c){

        super(px, py, c);
    }

    public void setWidth(int cote){
        super.height = cote;
        super.width = cote;
    }

    public void setHeight(int cote){
        super.width = cote;
        super.height = cote;
    }

    public void setBoundingBox(int widthBB, int heightBB){
        this.width = widthBB;
        this.height = widthBB;
    }
}
