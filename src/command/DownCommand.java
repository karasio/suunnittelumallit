package command;

public class DownCommand implements Command {
    private Screen screen;

    public DownCommand(Screen screen) {
        this.screen = screen;
    }
    @Override
    public void execute() {
        screen.rollDown();
    }

    @Override
    public void addCommand(Command c) {
        throw new RuntimeException("This command can not stack commands");
    }
}
