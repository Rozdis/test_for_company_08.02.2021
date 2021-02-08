package figurs;

public class Circle extends Figure {
    private double radius = 36;


    public Circle(){
        area = Math.PI * Math.pow(radius, 2);
        color = "чёрный";
    }

    @Override
    public void draw() {
        System.out.print("Фигура - круг: " + "площадь: " + area + " кв.ед., " + "цвет: " + color + ", " + "радиус: " + radius + " ед.");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
