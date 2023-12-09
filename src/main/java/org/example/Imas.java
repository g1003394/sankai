package org.example;

public class Imas {

    private String name;

    private String age;

    private String type;

    public Imas(String name, String age, String type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getType(){
        return type;
    }
    public void setName(String name){
        this.name = name;
    }
}
