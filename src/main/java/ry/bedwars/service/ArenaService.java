package ry.bedwars.service;

import ry.bedwars.model.Arena;
import ry.bedwars.model.Command;

import java.util.List;

public interface ArenaService {

    void addArena(int id, String name, List<Command> commandList);
    void deleteArena(int id);

    Arena findArenaById(int id);
    List<Arena> findAll();
}
