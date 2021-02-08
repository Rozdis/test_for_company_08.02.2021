package figurs;

public class Square extends Figure{
    private final double side = 2;

    public Square(){
        area = Math.pow(side, 2);
        color = "зелёный";
    }


    @Override
    public void draw() {
        System.out.print("Фигура - квадрат: " + "площадь: " + area + " кв.ед., " + "цвет: " + color + ", " + "длина стороны: " + side + " ед.");
    }

    public double getSide() {
        return side;
    }
}
