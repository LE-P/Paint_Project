public class Point {
    private int px;
    private int py;

    public int getpx() { return px; }
    public int getpy() { return py; }

    public void setpx(int px) { this.px= px; }
    public void setpy(int py) { this.py= py; }

    public Point(int px, int py){
        this.px=px;
        this.py=py;
    }

    public Point(){
        px=0;
        py=0;
    }


    public static void main(String[] args) {
        Point point1= new Point();

        System.out.println(point1);
    }
}
