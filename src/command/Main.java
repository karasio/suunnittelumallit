package command;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command up = new UpCommand(screen);
        Command down = new DownCommand(screen);

        Button upButton = new Button(up);
        Button downButton = new Button(down);

        upButton.push();
        downButton.push();
    }
}
