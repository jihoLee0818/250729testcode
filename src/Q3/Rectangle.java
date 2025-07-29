package Q3;

class Rectangle extends Shape {
    private double width;  // 가로
    private double height; // 세로

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double Area =  width * height;
        return Area;
    }
}
