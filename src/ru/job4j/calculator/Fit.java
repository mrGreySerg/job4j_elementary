package ru.job4j.calculator;

public class Fit{

    public static double manWeight(double height){
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(double height){
        double rs1 = (height - 110) * 1.15;
        return rs1;
    }

    public static void main(String[] args){
        double man = Fit.manWeight(175);
        double  woman = Fit.womanWeight(165);
        System.out.println("Man 175 is " + man);
        System.out.println("Woman 165 is " + woman);
    }
}
