public class Triangle {

    //instance variables
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    static int numberofSide=3;

    public Triangle(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        this.base=base;
        this.height=height;
        this.sideLenOne=sideLenOne;
        this.sideLenTwo=sideLenTwo;
        this.sideLenThree=sideLenThree;
    }

    public double findArea(){
        return (base*height) / 2;
    }
}
