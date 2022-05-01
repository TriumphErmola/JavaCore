package MasterClass.Inheritance;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //хорошая практика по вызову конструкторов

    public Rectangle() {
        //вызываем 2 конструктор
        this(0, 0);
    }

    public Rectangle(int width, int height) {
        //вызываем 3 конструктор
        this(0, 0, width, height);
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(15, 20);
        System.out.println(rectangle1.getWidth());
        Rectangle rectangle2 = new Rectangle();
        System.out.println(rectangle2.getHeight());
        Rectangle rectangle3 = new Rectangle(1, 2, 3, 4);
        System.out.println(rectangle3.getX());
    }
}
