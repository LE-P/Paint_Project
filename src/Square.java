import java.awt.Color;

public class Square extends Rectangle {

    public Square(int c){
        super(c, c);
    }

    public Square (int px, int py, Color c){

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
        this.width = heightBB;
        this.height = heightBB;
    }
}
