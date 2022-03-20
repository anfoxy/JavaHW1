package com.netcracer;

import com.netcracer.oop1.figures.trangle.*;
import com.netcracer.oop1.library.*;
import com.netcracer.oop2.ball.Visual;
import com.netcracer.oop2.math.*;
import com.netcracer.oop1.figures.*;
import com.netcracer.oop1.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args){
        testCircle();
        testRectangle();
        testEmployee();
        testBook();
        testMyPoint();
        testMyTriangle();
        testMyComplex();
        testMyPolynomial();
        testBall();
    }

    public static void testCircle (){

        Circle circle = new Circle(5.0);
        System.out.println("Radius circle = "+ circle.getRadius());
        System.out.println("correct answer: 5.0");
        System.out.println("Color circle  = "+ circle.getColor());
        System.out.println("correct answer: red");
        System.out.println("area of the circle = "+ circle.getArea());
        System.out.println("correct answer:      78.53981633974483");
        System.out.println(circle.toString());
        circle.setRadius(25);
        circle.setColor("blue");
        System.out.println("New radius circle = "+ circle.getRadius());
        System.out.println("correct answer:     25.0");
        System.out.println("New color circle = "+ circle.getColor());
        System.out.println("correct answer:    blue");
        System.out.println("new area of the circle = "+ circle.getArea());
        System.out.println("new correct answer:      1963.4954084936207");

        Circle circle2 = new Circle(15.0,"black");
        System.out.println("Radius circle2 = "+ circle2.getRadius());
        System.out.println("correct answer:  15.0");
        System.out.println("Color circle2  = "+ circle2.getColor());
        System.out.println("correct answer:  black");
        System.out.println(circle2.toString());

        System.out.println("-------------------------------");
    }

    public static void testRectangle(){
        Rectangle rectangle = new Rectangle(5,5);
        System.out.println("Length rectangle = "+ rectangle.getLength());
        System.out.println("correct answer:    5.0");
        System.out.println("Width rectangle = "+ rectangle.getWidth());
        System.out.println("correct answer:   5.0");
        System.out.println("rectangle area = "+ rectangle.getArea());
        System.out.println("correct answer:  25.0");
        System.out.println("rectangle perimeter = "+ rectangle.getPerimeter());
        System.out.println("correct answer:       20.0");
        System.out.println(rectangle.toString());
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println("New rectangle length = "+ rectangle.getLength());
        System.out.println("correct answer:        10.0");
        System.out.println("New rectangle width = "+ rectangle.getWidth());
        System.out.println("correct answer:       20.0");
        System.out.println(rectangle.toString());
        System.out.println("-------------------------------");
    }

    public static void testEmployee(){
        Employee employee = new Employee(1,"Nastya","Kazhaeva",80);
        System.out.println(employee.getName());
        System.out.println("Employee first name = "+employee.getFirstName());
        System.out.println("correct answer:       Nastya");
        System.out.println("Employee last name = "+employee.getLastName());
        System.out.println("correct answer:      Kazhaeva");
        System.out.println("Employee id =   "+employee.getId());
        System.out.println("correct answer: 1");

        System.out.println("Employee salary = "+employee.getSalary());
        System.out.println("correct answer:   80");
        System.out.println("Employee annual salary = "+employee.getAnnualSalary());
        System.out.println("correct answer:          960");
        System.out.println("Employee raise salary 20% = "+employee.raiseSalary(20));
        System.out.println("correct answer:             96");

        System.out.println("New employee salary = "+employee.getSalary());
        System.out.println("correct answer:       96");
        System.out.println("Employee raise salary (-20%) = "+employee.raiseSalary(-20));
        System.out.println("correct answer:                96");
        employee.setSalary(100);
        System.out.println("New employee salary = "+employee.getSalary());
        System.out.println("correct answer:       100");
        System.out.println(employee.toString());
        System.out.println("-------------------------------");
    }

    public static void testBook(){
        Authors authors1 = new Authors("Name1","Email1",'m');
        Authors authors2 = new Authors("Name2","Email2",'w');
        Authors authors3 = new Authors("Name3","Email3",'m');

        Authors[] authors = {authors1,authors2,authors3};
        Book book = new Book("NameBook",authors,10.0,3);
        System.out.println("Book name =     "+book.getName());
        System.out.println("correct answer: NameBook");
        System.out.println("Book price =    "+book.getPrice());
        System.out.println("correct answer: 10.0");
        System.out.println("Book qty =      "+book.getQty());
        System.out.println("correct answer: 3");

        System.out.println("Book authors = "+ Arrays.toString(book.getAuthors()));
        System.out.println("Book author names = "+book.getAuthorNames());
        System.out.println("correct answer:     Name1; Name2; Name3;");
        book.setPrice(30);
        book.setQty(1);
        System.out.println("New book price =    "+book.getPrice());
        System.out.println("correct answer:     30.0");
        System.out.println("New book qty =      "+book.getQty());
        System.out.println("correct answer:     1");
        System.out.println(book.toString());
        System.out.println("-------------------------------");
    }

    public static void testMyPoint(){
        MyPoint point1 = new MyPoint(10,10);
        MyPoint point2 = new MyPoint(5,0);
        System.out.println("Point1 X = "+point1.getX());
        System.out.println("correct answer: 10");
        System.out.println("Point1 Y = "+point1.getY());
        System.out.println("correct answer: 10");
        System.out.println("Point1 XY = "+ Arrays.toString(point1.getXY()));
        System.out.println("distance from this point to the point (1,1) = "+ point1.distance(1,1));
        System.out.println("correct answer:                               12.727922061357855");
        System.out.println("distance from this point to the MyPoint = "+ point1.distance(point2));
        System.out.println("correct answer:                           11.180339887498949");
        System.out.println("distance from this point to (0,0) = "+point1.distance());
        System.out.println("correct answer:                     14.142135623730951");
        System.out.println(point1.toString());
        System.out.println("-------------------------------");
    }

    public static void testMyTriangle(){

        MyTriangle triangle = new MyTriangle(2,1,3,4,4,1);
        System.out.println("Perimetr triangle = " + triangle.getPerimetr());
        System.out.println("correct answer:     8.32455532033676");
        System.out.println("Type triangle = " + triangle.getType());
        System.out.println("correct answer: Isosceles");

        MyTriangle triangle1 = new MyTriangle(1,1,7,9,9,1);
        System.out.println("Perimetr triangle1 = " + triangle1.getPerimetr());
        System.out.println("correct answer:      26.246211251235323");
        System.out.println("Type triangle1 = " + triangle1.getType());
        System.out.println("correct answer:  Scalene");

        MyTriangle triangle2 = new MyTriangle(0,0,0,10,9,5);
        System.out.println("Perimetr triangle2 = " + triangle2.getPerimetr());
        System.out.println("correct answer:      30.591260281974");
        System.out.println("Type triangle2 = " + triangle2.getType());
        System.out.println("correct answer:  Isosceles");
        System.out.println("-------------------------------");
    }

    public static void testMyComplex(){
        MyComplex complex = new MyComplex(-2.5,2.7);
        MyComplex complex1 = new MyComplex(1,2);
        MyComplex complex2 = new MyComplex(3,0);
        System.out.println("complex =       "+complex.toString());
        System.out.println("correct answer: (-2.5+2.7i)");
        System.out.println("real == -2.5 and imag == 2.7 in complex ? "+ complex.equals(-2.5,2.7));
        System.out.println("correct answer:                           true");
        complex.setValue(-2,2);
        System.out.println("New complex =   "+complex.toString());
        System.out.println("correct answer: (-2.0+2.0i)");
        System.out.println("complex1 =       "+complex1.toString());
        System.out.println("correct answer:  (1.0+2.0i)");
        System.out.println("is the first complex number equal to the second? "+ complex.equals(complex1));
        System.out.println("correct answer:                                  false");
        System.out.println("complex magnitude = "+ complex.magnitude());
        System.out.println("correct answer:     2.8284271247461903");
        System.out.println("complex argument = "+ complex.argument());
        System.out.println("correct answer:    2.356194490192345");
        System.out.println("complex add  complex2 (3.0+0i)= "+ complex.add(complex2));
        System.out.println("correct answer:                 (1.0+2.0i)");
        System.out.println("is the new first complex number equal to the second? "+ complex.equals(complex1));
        System.out.println("correct answer:                                      true");
        complex = complex1.subtractNew(complex2);
        System.out.println("complex = (1.0+2.0i)-(3.0+0i) = "+complex.toString());
        System.out.println("correct answer:                 (-2.0+2.0i)");
        System.out.println("complex dived complex1 = "+complex.divide(complex1));
        System.out.println("correct answer:          (0.4+1.2i)");
        System.out.println("complex2 multiply complex1 = "+complex2.multiply(complex1));
        System.out.println("correct answer:              (3.0+6.0i)");

        System.out.println("-------------------------------");
    }

    public static void testMyPolynomial(){
        double[] m = {1,2,3,4,5};
        double[] m2 = {1,2,3,4};

        MyPolynomial polynomial = new MyPolynomial(m);
        MyPolynomial polynomial1 = new MyPolynomial(m2);

        System.out.println("polynomial =    "+polynomial.toString());
        System.out.println("correct answer: 1x^4+2x^3+3x^2+4x+5");

        System.out.println("polynomial1 =   "+polynomial1.toString());
        System.out.println("correct answer: 1x^3+2x^2+3x+4");

        System.out.println("Degree polynomial1 = "+ (polynomial1.getDegree()+1));
        System.out.println("correct answer:      4");
        System.out.println("polynomial add polynomial1 = "+polynomial.add(polynomial1));
        System.out.println("correct answer:              1x^4+3x^3+5x^2+7x+9");

        System.out.println("polynomial multiply polynomial1 = "+polynomial.multiply(polynomial1));
        System.out.println("correct answer:                   1x^7+4x^6+10x^5+20x^4+30x^3+34x^2+31x+20");
        double[] m3 = {-2.5,-10.7,3,4,8};
        MyPolynomial polynomial2 = new MyPolynomial(m3);
        System.out.println("polynomial2 =   "+polynomial2.toString());
        System.out.println("correct answer: -2.5x^4-10.7x^3+3x^2+4x+8");

        System.out.println("for x = 2 , the polynomial2 = "+polynomial2.evaluate(2));
        System.out.println("correct answer:               -97.6");
    }

    public static void testBall(){
        new Visual().setVisible(true);
    }
}
