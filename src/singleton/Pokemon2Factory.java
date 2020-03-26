package singleton;

public enum Pokemon2Factory implements GameCharacterFactory{
    INSTANCE;

    private Pokemon2Factory() {}

    public static Pokemon2Factory getInstance() {
        return INSTANCE;
    }

    @Override
    public IMainCharacter createMainCharacter() {
        return new Ash();
    }

    @Override
    public IEnemyCharacter createEnemyCharacter() {
        return new EvilCat();
    }
}
