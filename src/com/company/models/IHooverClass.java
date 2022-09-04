package com.company.models;

import com.company.enums.CompassEnum;
import org.jetbrains.annotations.NotNull;

public class IHooverClass {
    private int x;
    private int y;
    private CompassEnum compass;
    private int direction;

    public IHooverClass() {

    }
    public IHooverClass(int x, int y, @NotNull CompassEnum compass) {
        super();
        this.x = x;
        this.y = y;
        this.compass = compass;
        // set the direction
        switch (compass) {
            case N:
                this.direction = 0;
                break;
            case E:
                this.direction = 1;
                break;
            case S:
                this.direction = 2;
                break;
            case W:
                this.direction = 3;
                break;
        }


    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public CompassEnum getCompass() {
        return compass;
    }

    public void setCompass(CompassEnum compass) {
        this.compass = compass;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    public void setDirectionAndCompass(int direction) {
        this.direction = direction % 4;
        switch (this.direction) {
            case 0:
                this.compass = CompassEnum.N;
                break;
            case 1:
                this.compass = CompassEnum.E;
                break;
            case 2:
                this.compass = CompassEnum.S;
                break;
            case 3:
                this.compass = CompassEnum.W;
                break;
        }

    }
    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                ", compass=" + compass +'}';
    }
}
