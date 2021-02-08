package figurs;

abstract public class Figure {
    //default variables
    protected double area;
    protected String color;

    //method that returns area
    public double getArea(){
        return area;
    }
    //method that returns color
    public String getColor(){
        return color;
    }
    //method to draw the figure
    abstract public void draw();

}
