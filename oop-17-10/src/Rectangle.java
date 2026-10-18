public class Rectangle extends  Shape{
    private double width;
    private double height;

//    cach 1: tao getter, setter
//    cach 2: them logic kiem tra width, height trong ham khoi tao
    public Rectangle(double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("Width and height must be positive");
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
