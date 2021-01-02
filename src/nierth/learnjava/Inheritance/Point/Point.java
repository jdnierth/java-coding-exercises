package nierth.learnjava.Inheritance.Point;

public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        int differenceXsquare = (int) Math.pow(getX(),2);
        int differenceYsquare = (int) Math.pow(getY(),2);
        return Math.sqrt(differenceXsquare + differenceYsquare);
    }
    public double distance(int x, int y){
        int differenceXsquare = (int) Math.pow(getX() - x,2);
        int differenceYsquare = (int) Math.pow(getY() - y,2);
        return Math.sqrt(differenceXsquare + differenceYsquare);
    }
    public double distance(Point z){
        int differenceXsquare = (int) Math.pow(getX() - z.x,2);
        int differenceYsquare = (int) Math.pow(getY() - z.y,2);
        return Math.sqrt(differenceXsquare + differenceYsquare);
    }

}
