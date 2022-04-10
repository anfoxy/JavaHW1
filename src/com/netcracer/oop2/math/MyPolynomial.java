package com.netcracer.oop2.math;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {

        this.coeffs = new double[coeffs.length];
        for (int i = 0; i < this.coeffs.length; i++) {
            this.coeffs[i] = coeffs[coeffs.length - 1 - i];
        }

    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder("");
        for (int i = this.getDegree(); i >= 0; i--) {
            if (Math.abs(this.coeffs[i]-0) <= 0.00001) continue;
            if ((this.coeffs[i] > 0) && (i != this.getDegree()))
                s.append("+");
            if (Math.abs((int) this.coeffs[i]-this.coeffs[i]) <= 0.00001) s.append((int) this.coeffs[i]);
            else s.append(this.coeffs[i]);
            if (i == 1) s.append("x");
            else if (i != 0) s.append("x^" + i);
        }
        return s.toString();
    }

    public MyPolynomial add(MyPolynomial right) {
        int max = Math.max(this.getDegree(), right.getDegree());
        int min = Math.min(this.getDegree(), right.getDegree());
        double[] ArrayResult = new double[max + 1];
        MyPolynomial result = new MyPolynomial(ArrayResult);
        for (int i = 0; i <= min; i++) {
            result.coeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        if (this.getDegree() > right.getDegree())
            System.arraycopy(this.coeffs, min + 1, result.coeffs, min + 1, max - min);
        else if (right.getDegree() > this.getDegree())
            System.arraycopy(right.coeffs, min + 1, result.coeffs, min + 1, max - min);
        return result;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double[] ArrayResult = new double[this.getDegree() + 1 + right.getDegree()];
        MyPolynomial result = new MyPolynomial(ArrayResult);
        for (int i = this.getDegree(); i >= 0; i--) {
            for (int j = right.getDegree(); j >= 0; j--) {
                result.coeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }

    public double evaluate(double x){

        double result = 0;
        for(int i=0;i<= this.getDegree();i++){
            result+= this.coeffs[i] *Math.pow(x,i);

        }
        return result;
    }

}
