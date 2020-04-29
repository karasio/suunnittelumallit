package command;

import java.util.ArrayList;
import java.util.List;

public class CommandStack implements Command{
    List<Command> commands;

    public CommandStack() {
        commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

    @Override
    public void addCommand(Command c) {
        commands.add(c);
    }
}
