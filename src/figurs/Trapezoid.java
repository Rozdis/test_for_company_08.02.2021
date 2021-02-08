package figurs;

public class Trapezoid extends Figure{
    private double sideA = 34;
    private double sideB = 44;
    private double height = 23;

    public Trapezoid(){
        area = ((sideA + sideB) / 2) * height;
        color = "градиент";
    }

    @Override
    public void draw() {
        System.out.print("Фигура - трапеция: " + "площадь: " + area + " кв.ед., " + "цвет: " + color + ", " + "высота: " + height + " ед.");
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }
}
