package com.company;
import  java.util.Scanner;
import static java.lang.Math.*;

class Main {

    public static void main(String [] args) {
        Point3d p1,p2,p3;
        while (true)
        {
            p1 = readPoint(1);
            p2 = readPoint(2);
            p3 = readPoint(3);
            if (p1.equals(p2) || p1.equals(p3) || p2.equals(p3)){
                System.out.println("Equal coordinates repeat input");
            }
            else break;
        }
        System.out.printf("Area = %.2f\n", computeArea(p1, p2, p3));
        // System.out.printf("%.2f\n", p1.distanceTo(p2));
    }
    public static Point3d readPoint(int num){
        System.out.printf("Input coordinates #%d: ", num);
        Scanner s = new Scanner(System.in);
        return new Point3d(s.nextDouble(),s.nextDouble(),s.nextDouble());

    }
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3)
    {
        double a,b,c,p;

        a = p1.distanceTo(p2);
        b = p2.distanceTo(p3);
        c = p3.distanceTo(p1);
        p = (a + b + c)/2;
        return sqrt(p * (p-a) * (p-b) * (p-c));

    }
}

