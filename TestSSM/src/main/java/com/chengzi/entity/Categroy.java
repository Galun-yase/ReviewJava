package com.chengzi.entity;

public class Categroy {
    private int id;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Categroy{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
