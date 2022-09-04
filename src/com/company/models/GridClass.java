package com.company.models;

public class GridClass {

    private int height ;
    private int width ;

    public GridClass(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public GridClass() {

    }

    @Override
    public String toString() {
        return "GridClass{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
