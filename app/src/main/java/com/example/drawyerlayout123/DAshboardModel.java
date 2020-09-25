package com.example.drawyerlayout123;

public class DAshboardModel {
    private String icon;
    private String text;
    private String color;

    public DAshboardModel(String icon, String text, String color) {
        this.icon = icon;
        this.text = text;
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
