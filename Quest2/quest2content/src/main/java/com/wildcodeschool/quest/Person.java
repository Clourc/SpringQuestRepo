package com.wildcodeschool.quest;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getPersonName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }
}
