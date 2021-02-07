package com.company;

public class Point {
    double x;
    double y;

    public Point(double x, double y){
        this.x = x ;
        this.y = y ;
    }
    public Point middle(Point p) {

        return new Point((this.x + p.x)/2,(this.y + p.y)/2);
    }
    public double distance(Point p) {
      double diffx = Math.pow(x - p.x, 2); //(x1 - x2)^2 + (y1 - y2)^2 כול זה בשורש
      double diffy = Math.pow(y - p.y, 2);

      return Math.sqrt(diffx + diffy);
    }
    public Double areaSize(Point p, Point t) {
     double diff1 = x * (t.y - p.y);
     double diff2 = p.x * (y - t.y);
     double diff3 = t.x * (p.y - y);

     return Math.abs(diff1 + diff2 + diff3) /2;
    }
    public double slope() {

        return y / x;
    }
}