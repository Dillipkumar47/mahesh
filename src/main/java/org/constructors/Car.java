package org.constructors;

public class Car {



    public Car(float len,String type){
        this.length=len;
        this.type=type;
    }

    public Car(float len,String type,int wheelBase){
        this.length=len;
        this.type=type;
        this.wheelBase=wheelBase;
    }
    private int wheelBase;
    private float length;
    private String type;



    public void gearShift(){
        System.out.println("I shift gears manually");
    }

    @Override
    public String toString() {


        String base;
        if(this.wheelBase==0){
            base="Not Available";
        }
        else{
            base=String.valueOf(this.wheelBase);
        }

        return "Car's length is "+this.length+" meters , type is "+this.type+" " +
                "wheel base is "+base;
    }
}
