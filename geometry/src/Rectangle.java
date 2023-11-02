public class Rectangle {
    private int width = 0;
    private int height = 0;
    private Point origin;

    public Rectangle() {
        origin = new Point(0, 0);
    }

    public Rectangle(Point p) { // dentro del parentesis es lo que recibe (punto p que = p = origin = 0,0)
        origin = p;
    }

    public void move(int x, int y) {
        this.origin.setX(x);
        this.origin.setY(y);
    }

    public int getArea() {
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Point getOrigin() {
        return origin;
    }

    public void setOrigin(Point origin) {
        this.origin = origin;
    }

    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public Rectangle(Point p, int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

}
