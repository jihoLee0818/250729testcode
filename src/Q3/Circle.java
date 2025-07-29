package Q3;

class Circle extends Shape {
    private double radius; // 반지름

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double Area =  radius * radius * 3.14;
        return Area;
    }
}