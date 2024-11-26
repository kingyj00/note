package com.ll;

class NumberBook {
    int id;
    String name;
    String number;

    NumberBook(int id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberBook (id=%d, name=\"%s\", number=\"%s\")".formatted(id, name, number);
    }
}
