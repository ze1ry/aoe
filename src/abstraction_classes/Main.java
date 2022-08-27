package abstraction_classes;

public class Main {
    public static void main(String[] args ){

        Rectangle rect = new Rectangle(3, 4);
        System.out.println(rect.getSquare());
    }
}


interface Shape {
    public int getSquare();
}

abstract class Round implements Shape {
}

class Circle extends Round {
    double p = 3.14;
    int r;

    @Override
    public int getSquare() {
        return (int) (p*r*r);
    }
}

class Oval extends Round {
    double p = 3.14;
    int r1;
    int r2;

    @Override
    public int getSquare() {
        return (int) (p*r1*r2);
    }
}


abstract class Rectangular implements Shape{
    int side_1;
    int side_2;

    public Rectangular(int side_1, int side_2) {
        this.side_1 = side_1;
        this.side_2 = side_2;
    }

    public int getSquare() {
        return this.side_1 * this.side_2;
    }
}


class Rectangle extends Rectangular {
    public Rectangle(int side_1, int side_2) {
        super(side_1, side_2);
    }
}

class Square extends Rectangular {
    public Square(int side_1, int side_2) {
        super(side_1, side_2);
    }
}

