package figurs;

public class Triangle extends Figure{
    private double legA = 3;
    private double legB = 6;
    private double hypotenuse = 8;

    public Triangle(){
        area = (legA * legB) / 2;
        color = "синий";
    }

    @Override
    public void draw() {
        System.out.print("Фигура - треугольник: " + "площадь: " + area + " кв.ед., " + "цвет: " + color + ", " + "длина гипотинузы: " + hypotenuse + " ед.");
    }

    public double getLegA() {
        return legA;
    }

    public double getLegB() {
        return legB;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }
}
