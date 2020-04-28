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
}
