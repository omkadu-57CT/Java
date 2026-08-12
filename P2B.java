// write a program to implement method overriding using java

abstract class Shape {
    float area; 
    
    public abstract void calculateArea();

    public float display() {
        return area;
    }
}

class Circle extends Shape {

    private float r;
    Circle(float r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        area = 2 * 3.14f * r;
    }
}


class Rectangle extends Shape {

    private float h,w;

    Rectangle(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public void calculateArea() {
        area = h * w;
    }
}

class P2B {
public static void main(String[] args) {
    Shape e1 = new Circle(5);
    Shape e2 = new Rectangle(10, 5);
    e1.calculateArea();
    e2.calculateArea();
    System.out.println("Circle: "+e1.display());
    System.out.println("Rectangle: "+e2.display());
}
}