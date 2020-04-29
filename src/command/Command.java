package command;

public interface Command {
    void execute();
    void addCommand(Command c);
}
