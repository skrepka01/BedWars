package ry.bedwars.model;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private int idArena;
    private String name;
    private String color;

    public Command(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Command(int idArena,String name, String color) {
        this.idArena = idArena;
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
