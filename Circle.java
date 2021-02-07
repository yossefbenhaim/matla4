package com.company;

public class Circle {
     Point center;
    double radius;

    public Circle(double radius) {
        this.radius=radius;
        this.center= new Point(0,0);

    }
    public  void move(Point p){
        this.center= new Point(p.x,p.y);
    }
    public double areaSize(){
        double S = 0;
        S = Math.pow(radius,2) * Math.PI;
       return S;
    }
    public double circumference() {
        double P = radius*2*Math.PI;
        return P;
    }
    public boolean pointLocation(Point p){
       if(p.distance(center)> radius){
           return false;
       }else{
           return true;
       }
    }
}