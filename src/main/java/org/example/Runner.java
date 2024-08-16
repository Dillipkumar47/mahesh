package org.example;

import org.collections.Student;
import org.constructors.Car;
import org.constructors.SubaruCrosstrek;
import org.inheritance.AndroidPhone;
import org.inheritance.NokiaPhone;
import org.inheritance.Phone;

import java.lang.reflect.Array;
import java.util.*;


public class Runner {


    public static void main(String args[]){

        String str="Mahesh";
        String str2="Dillip";
        String [] strArray= new String[2];
        strArray[0]=str;
        strArray[1]=str2;
        List<String> strList=new ArrayList<>();
        strList.add(str);
        strList.add("Harsit");
        strList.add(str2);
        strList.add("Harsit");


        System.out.println(strList);
        System.out.println(strList.size());
        System.out.println(strList.contains("Harsit"));
        for (String currentStr:strList) {
            System.out.println(strList.indexOf(currentStr)+": "+currentStr);

        }

        Set<Integer> intSet=new HashSet<>();
        intSet.add(5);
        intSet.add(6);
        intSet.add(5);
        System.out.println(intSet);
        Map<Integer, Student> studentMap=new HashMap<>();
        Student st1=new Student("Mahesh",1,'M');
        Student st2=new Student("Dillip",2,'T');
        Student st3=new Student("Harsit",3,'F');
        studentMap.put(st1.rollNo,st1);
        studentMap.put(st2.rollNo,st2);
        studentMap.put(st3.rollNo,st3);
        System.out.println(studentMap);
        System.out.println(studentMap.size());
        Set<Integer>stkeySet=studentMap.keySet();
        for (Object key:stkeySet
             ) {
            System.out.println(key+" , "+studentMap.get(key).name);

        }


        //strArray[2]="Harsit";




        String strWrapper=new String("Mahesh");
        //System.out.println(str);



 /*
  Car objCar1=new Car(4.5f,"Sedan");
        Car subaru=new SubaruCrosstrek(6.5f,"SUV",270,"Sun roof");

        System.out.println("Car 1 : "+objCar1.toString());
        System.out.println("Car 2 : "+objCar1.toString());
  Phone phone1=new NokiaPhone();
        phone1=new AndroidPhone();
        System.out.println("Getting camera Pixel of phone = "+phone1.getCameraPixel());*/
    }

}
