package com.atguigu.gmall.gmalldemo.controller;

public class Gmall {

    private String Url;
    private String name;

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Gmall{" +
                "Url='" + Url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Gmall(String url) {
        Url = url;
    }
}
