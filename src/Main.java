import figurs.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        int numberOfFigures = (int)(1 + Math.random() * 4);
        List<Figure> allFigures = new ArrayList<>(4);
        allFigures.add(new Square()); allFigures.add(new Circle());
        allFigures.add(new Triangle()); allFigures.add(new Trapezoid());

        Figure[] ownNumberOfFigures = new Figure[numberOfFigures];
        //variable to control number of elements

        int counter = 4;
        for (int i = 0; i < numberOfFigures; i++) {
            int randomIndexOfFigure = (int) (Math.random() * counter--);
            ownNumberOfFigures[i] = allFigures.get(randomIndexOfFigure);
            allFigures.remove(randomIndexOfFigure);
        }

        //show results
        for (int i = 0; i < ownNumberOfFigures.length; i++) {
            ownNumberOfFigures[i].draw();
            System.out.println();
        }
    }
}
