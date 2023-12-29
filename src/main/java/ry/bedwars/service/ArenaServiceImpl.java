package ry.bedwars.service;

import ry.bedwars.dao.ArenaDao;
import ry.bedwars.model.Arena;
import ry.bedwars.model.Command;

import java.util.ArrayList;
import java.util.List;

public class ArenaServiceImpl implements ArenaService{

    private final ArenaDao arenaDao;

    private final List<Command> arena1 = new ArrayList<>();
    private final List<Command> arena2 = new ArrayList<>();
    private final List<Command> arena3 = new ArrayList<>();
    private final List<Command> arena4 = new ArrayList<>();


    public ArenaServiceImpl(ArenaDao arenaDao)
    {
        this.arenaDao = arenaDao;
    }

    @Override
    public void addArena(int id, String name, List<Command> commandList) {
        ArenaServiceImpl arenaService = new ArenaServiceImpl(arenaDao);
        arenaService.addArena(1,"Power", arena1);
        arenaService.addArena(2,"Balloon", arena2);
        arenaService.addArena(3,"Stone", arena3);
        arenaService.addArena(4,"Cactus", arena4);
    }

    @Override
    public void deleteArena(int id) {
        ArenaServiceImpl arenaService = new ArenaServiceImpl(arenaDao);
        arenaService.deleteArena(id);
    }

    @Override
    public Arena findArenaById(int id) {
        ArenaServiceImpl arenaService = new ArenaServiceImpl(arenaDao);
        return arenaService.findArenaById(id);
    }

    @Override
    public List<Arena> findAll() {
        ArenaServiceImpl arenaService = new ArenaServiceImpl(arenaDao);
        return arenaService.findAll();
    }
}
