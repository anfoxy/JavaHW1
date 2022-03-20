package com.netcracer.oop2.math;

public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("(");
        if (real != 0) s.append(real);
        if (imag < 0) s.append(imag + "i" + ')');
        else s.append("+" + imag + "i" + ')');
        return s.toString();
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(double real, double imag) {
        return (imag == this.imag) && (real == this.real);
    }

    public boolean equals(MyComplex another) {
        return (another.imag == this.imag) && (another.real == this.real);
    }

    public double magnitude() {
        double powReal = Math.pow(real, 2);
        double powImag = Math.pow(imag, 2);
        return Math.sqrt(powReal + powImag);
    }

    public double argument() {
        return Math.atan2(imag, real);
    }

    public MyComplex add(MyComplex right) {
        this.imag += right.imag;
        this.real += right.real;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);

    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);

    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + right.real * this.imag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double resultReal = (this.real * right.real + this.imag * right.imag) /
                            (right.imag * right.imag + right.real * right.real);
        double resultImag = (this.imag * right.real - this.real * right.imag) /
                            (right.imag * right.imag + right.real * right.real);
        this.setValue(resultReal, resultImag);
        return this;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, this.imag);
    }

}
