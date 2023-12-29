package ry.bedwars.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class Arena {

    private int id;
    private String name;
    private int commands;

    //todo: id Arena int Commands
    private Map<Integer, Integer> playerArena = new HashMap<>();
    private List<Command> commandList = new ArrayList<>();

    public Arena()
    {

    }
    public Arena( int id,String name, int commands, Map<Integer, Integer> playerArena, List<Command> commandList) {
        this.id = id;
        this.name = name;
        this.commands = commands;
        this.playerArena = playerArena;
        this.commandList = commandList;
    }

    public Arena(int id, String name, int commands, List<Command> commandList) {
        this.id = id;
        this.name = name;
        this.commands = commands;
        this.commandList = commandList;
    }

    public Arena(String name, int commands) {
        this.name = name;
        this.commands = commands;
    }

    public Arena(int id, String name, List<Command> commandList) {
        this.id = id;
        this.name = name;
        this.commandList = commandList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCommands() {
        return commands;
    }

    public void setCommands(int commands) {
        this.commands = commands;
    }
}
