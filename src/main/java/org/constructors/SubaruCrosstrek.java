package org.constructors;

public class SubaruCrosstrek extends Car{

    private String roofType;
    public SubaruCrosstrek(float len, String type, int wheelBase,String roofType) {
        super(len, type, wheelBase);
        this.roofType=roofType;
    }

    @Override
    public String toString() {
        return super.toString()+" in Addition, Subaru Crosstrek has a Sunroof";
    }
}
