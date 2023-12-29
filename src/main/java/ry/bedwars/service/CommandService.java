package ry.bedwars.service;

public interface CommandService {

    void addCommand(int idArena, String name, String color);
    void deleteCommand(int idArena);
}
