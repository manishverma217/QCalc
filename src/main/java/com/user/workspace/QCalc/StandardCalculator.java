package com.user.workspace.QCalc;

public class StandardCalculator {
    protected double result;

    public static void getVersion(){
        System.out.println("Standard Calculator 1.0");
    }
    public final void add(double num1 , double num2){
        result = num1 + num2;
        if((result == Double.POSITIVE_INFINITY) || (result == Double.MAX_VALUE)){
            throw new ArithmeticException("Double Overflow");
        }
        setResult(result);
    }
    public final void add(int num1 , int num2){
        add((double)num1, (double)num2);
    }
    public final void subtract(double num1 , double num2){
        result = num1 - num2;
        if((result == -Double.MAX_VALUE) || (result == Double.NEGATIVE_INFINITY)){
            throw new ArithmeticException("Double Overflow");
        }
        setResult(result);
    }
    public final void subtract(int num1 , int num2){
        subtract((double)num1, (double)num2);
    }
    public final void multiply(double num1 , double num2){
        if(num1 == Double.MAX_VALUE || num1 == Double.POSITIVE_INFINITY || num1 == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Max Value reached. Multiplication not possible !!!" + num1);
        }
        if(num2 == Double.MAX_VALUE || num2 == Double.POSITIVE_INFINITY || num2 == Double.NEGATIVE_INFINITY){
            throw new ArithmeticException("Max Value reached. Multiplication not possible !!!" + num2);
        }
        result = num1 * num2;
        setResult(result);
    }
    public final void multiply(int num1 , int num2){
        multiply((double)num1, (double)num2);
    }
    public final void divide(double num1 , double num2){
        if(num2 == 0.0){
            throw new ArithmeticException("Divide By Zero !!!");
        }
        result = num1 / num2;
        setResult(result);
    }
    public final void divide(int num1 , int num2){
        divide((double)num1, (double)num2);
    }
    public double getResult() {
        return result;
    }
    public void setResult(double result) {
        if(result < 0){
            clearResult();
        }
        this.result = result;
    }
    public void clearResult(){
        result = 0;
    }
    public void printResult(){
        System.out.println("Standard Calculator result :" + result);
    }
}
