package com.ll;

public class NumberBook {
    private int id;
    private String name;
    private String number;

    NumberBook(int id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public  String getname() {
        return name;
    }
    public  String getnumber() {
        return number;
    }
    public  int getId() {
        return id;
    }

    public void setname(String name){
        this.name = name;
    }

    public void setnumber(String number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberBook (id=%d, name=\"%s\", number=\"%s\")".formatted(id, name, number);
    }
}
