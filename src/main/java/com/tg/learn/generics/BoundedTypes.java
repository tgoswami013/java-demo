package com.tg.learn.generics;

 class Compare1 implements Comparable<Compare1>{
     private String name;
     private int age;

     @Override
     public int compareTo(Compare1 otherPerson) {
         return Integer.compare(age, otherPerson.age);
     }

     public int getAge(){
         return age;
     }

     public String getName(){
         return name;
     }

     public Compare1(String name, int age){
        this.name = name;
        this.age = age;
     }

     @Override
     public String toString() {
         return "Compare1{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 '}';
     }

     public static <T extends Comparable<T>> T calculateMin(T num1, T num2){
        if(num1.compareTo(num2) < 0)
            return num1;
        return num2;
    }

    public static <T extends Number> double add(T num1, T num2){
         double result = num1.doubleValue() + num2.doubleValue();
         return result;
    }

 }
public class BoundedTypes {
    public static void main(String[] args) {
        System.out.println(Compare1.calculateMin(new Compare1("Ram",45),new Compare1("Sham", 50)));
    }
}
