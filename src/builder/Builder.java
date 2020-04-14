package builder;

public abstract class Builder {
    public void buildBuns() {}
    public void buildPatty() {}
    public void buildSalad() {}
    public void buildMayonnaise() {}
    public void buildPickles() {}
    public void buildCheese() {}
    public void buildOnions() {}
    public void buildBacon() {}

    public abstract Object getBurger();
}
