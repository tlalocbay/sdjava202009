package figure;

public class Reactangle extends Figure {
    private double a = 0;
    private double b = 0;

    public Reactangle (String name, double a){
        this.name = name;
        this.a = a;
        this.b = b;
        this.square = a * a;
        this.perimetr = 4 * a;
    }


    public Reactangle(String name, double a, double b){
        this.name = name;
        this.a = a;
        this.b = b;
        this.perimetr = 2*(a + b);
        this.square = a * b;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
        this.perimetr = 2 * (this.a + this.b);
        this.square = this.a * this.b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
        this.perimetr = 2 * (this.a + this.b);
        this.square = this.a * this.b;
    }

}
