package command;

public class UpCommand implements Command {
    private Screen screen;

    public UpCommand(Screen screen) {
        this.screen = screen;
    }

    @Override
    public void execute() {
        screen.rollUp();
    }

    @Override
    public void addCommand(Command c) {
        throw new RuntimeException("This command can not stack commands");
    }
}
