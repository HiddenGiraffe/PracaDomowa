package com.company;


public class Kolo {

    private double radius;
    private double surface;

    public void getRadius() {
        System.out.println("Wpisz promien");
        radius = Main.doubleScanner.nextDouble();

    }

    public void setSurface() {
        surface = Math.pow(radius, 2) * Math.PI;
    }

    public double getSurface() {
        setSurface();
        return surface;
    }
    public void wheelInscribed(){
        if(Main.wheelInscribed < radius){
            Main.wheelInscribed = radius;
        }
    }
    public void wheelDescribed(){
        if(Main.wheelDescribed < radius){
            Main.wheelDescribed = radius;
        }
    }

}
