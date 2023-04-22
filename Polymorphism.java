package Wiley_java;

class Shape {
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape myShape = new Shape(); 
        Shape myCircle = new Circle();
        Shape mySquare = new Square();
        myShape.draw();
        myCircle.draw();
        mySquare.draw(); 
    }
}
