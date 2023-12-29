package ry.bedwars.dao;

import ry.bedwars.model.Command;

public interface CommandDao {

    void addCommand(int idArena, String name, String color);
    void deleteCommand(int idArena);
}
