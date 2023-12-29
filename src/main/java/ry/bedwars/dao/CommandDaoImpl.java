package ry.bedwars.dao;

import ry.bedwars.model.Command;

import java.util.ArrayList;
import java.util.List;

public class CommandDaoImpl implements CommandDao {

    private final List<Command> commandList = new ArrayList<>();

    @Override
    public void addCommand(int idArena,String name, String color) {
        commandList.add(new Command(idArena,name,color));
    }

    @Override
    public void deleteCommand(int idArena) {
      Command command = commandList.get(idArena);
      commandList.remove(command);
    }
}
