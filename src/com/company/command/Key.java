package com.company.command;

import java.util.HashMap;

public class Key {
    private final HashMap<String, Command> commandHashMap = new HashMap<>();

    public void saveCommand(String commandName, Command command){
        commandHashMap.put(commandName, command);
    }

    public void execute(String commandName){
        Command command = commandHashMap.get(commandName);
        if(command==null){
            System.out.println("Unknown command");
        }else {
            command.execute();
        }
    }
}
