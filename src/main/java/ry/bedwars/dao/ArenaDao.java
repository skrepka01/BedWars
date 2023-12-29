package ry.bedwars.dao;

import ry.bedwars.model.Arena;
import ry.bedwars.model.Command;

import java.util.List;

public interface ArenaDao {

    void addArena(int id, String name, List<Command> commands);
    void deleteArena(int id);
    Arena findArenaById(int id);
    List<Arena> findAll();
}
