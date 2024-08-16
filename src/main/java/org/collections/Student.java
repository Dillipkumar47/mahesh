package org.collections;

public class Student {
    public String name;
    public int rollNo;
    public char gender;

    public Student(String name, int rollNo, char gender) {
        this.name = name;
        this.rollNo = rollNo;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+" Roll No: "+this.rollNo+" Gender: "+this.gender;
    }
}
