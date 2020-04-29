package command;

public class Main {
    public static void main(String[] args) {
        Screen screen = new Screen();
        Command up = new UpCommand(screen);
        Command down = new DownCommand(screen);
        Command stack = new CommandStack();
        for (int i = 0; i < 3; i++) {
            stack.addCommand(up);
            stack.addCommand(down);
        }

        Button upButton = new Button(up);
        Button downButton = new Button(down);
        Button record = new Button(stack);

        System.out.println("Pressing up");
        upButton.push();
        System.out.println("Pressing down");
        downButton.push();
        System.out.println("Doing predefined program with recorded commands");
        record.push();
    }
}
