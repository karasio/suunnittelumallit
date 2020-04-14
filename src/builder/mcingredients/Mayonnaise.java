package builder.mcingredients;

public class Mayonnaise {
    private String name;

    public Mayonnaise(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
