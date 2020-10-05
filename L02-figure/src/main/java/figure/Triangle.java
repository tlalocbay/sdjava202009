package figure;


public class Triangle extends Figure {
    private double a = 0;
    private double b = 0;
    private double c = 0;

    public Triangle (String name, double a, double b, double c){
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.perimetr = a+b+c;
        this.square = Math.sqrt((this.perimetr/2)*(this.perimetr/2 -this.a)*(this.perimetr/2 -this.b)*(this.perimetr/2-this.c));
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
        this.perimetr = this.a+this.b+this.c;
        this.square = Math.sqrt((this.perimetr/2)*(this.perimetr/2 -this.a)*(this.perimetr/2 -this.b)*(this.perimetr/2-this.c));
    }

    public void setB(double b) {
        this.b = b;
        this.perimetr = this.a+this.b+this.c;
        this.square = Math.sqrt((this.perimetr/2)*(this.perimetr/2 -this.a)*(this.perimetr/2 -this.b)*(this.perimetr/2-this.c));
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
        this.perimetr = this.a+this.b+this.c;
        this.square = Math.sqrt((this.perimetr/2)*(this.perimetr/2 -this.a)*(this.perimetr/2 -this.b)*(this.perimetr/2-this.c));
    }


}
