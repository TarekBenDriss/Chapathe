package com.bendriss.chapathe.model;

public class Salle {
    private String title;
    private String city;
    private int img;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Salle() {
    }

    public Salle(String title, String city, int img) {
        this.title = title;
        this.city = city;
        this.img = img;
    }
}
