package ry.bedwars.service;

import ry.bedwars.dao.CommandDao;

public class CommandServiceImpl implements CommandService {

    private final CommandDao commandDao;

    public CommandServiceImpl(CommandDao commandDao)
    {
        this.commandDao = commandDao;
    }

    @Override
    public void addCommand(int idArena, String name, String color) {
        CommandServiceImpl commandService = new CommandServiceImpl(commandDao);
        commandService.addCommand(idArena, name, color);
    }

    @Override
    public void deleteCommand(int idArena) {
        CommandServiceImpl commandService = new CommandServiceImpl(commandDao);
        commandService.deleteCommand(idArena);
    }
}
