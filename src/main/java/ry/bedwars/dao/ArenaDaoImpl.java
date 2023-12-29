package ry.bedwars.dao;

import ry.bedwars.model.Arena;
import ry.bedwars.model.Command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArenaDaoImpl implements ArenaDao {

    private final List<Arena> arenaList = new ArrayList<>();
    @Override
    public void addArena(int id, String name, List<Command> commands) {
        arenaList.add(new Arena(id,name,commands));
    }

    @Override
    public void deleteArena(int id) {
        Arena arena = arenaList.get(id);
        arenaList.remove(arena);
    }

    @Override
    public Arena findArenaById(int id) {
        return arenaList.get(id);
    }

    @Override
    public List<Arena> findAll() {
        return arenaList;
    }
}
