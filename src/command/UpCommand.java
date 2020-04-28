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
}
