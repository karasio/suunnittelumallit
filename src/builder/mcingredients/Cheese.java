package builder.mcingredients;

public class Cheese {
    private String name;

    public Cheese(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
