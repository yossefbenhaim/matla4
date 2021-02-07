package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Studens {
    String num;
    ArrayList<Integer> gradse;
    Scanner s = new Scanner(System .in);
public  Studens(String num){
    this.num=num;
    ArrayList<Integer> gradse = new ArrayList<Integer>();
}

    public Double studensAvg(){
    double sum = 0;
    for(int i :gradse) {
        sum += gradse.get(i);
    }
        return sum/ gradse.size();
    }
    public Boolean isTop(){
    if(studensAvg()>=90){
        return true;
    }else{
        return false;
    }
    }
    public Studens better(Studens other){
    Studens x = new Studens(s.next());
    if(x.studensAvg()>other.studensAvg()){
        return x;
    }else{
        return other;
    }
    }
    public ArrayList<Integer> filed(){
    ArrayList<Integer> filed = new ArrayList<Integer>();
    for(int i: gradse){
        if(gradse.get(i) <55){
            filed.add(gradse.get(i));
        }
    }
    return filed;
    }
}
