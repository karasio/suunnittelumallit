package singleton;

public enum MixerFactory implements GameCharacterFactory{
    INSTANCE;

    private MixerFactory() {}

    public static MixerFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public IMainCharacter createMainCharacter() {
        return new Ash();
    }

    @Override
    public IEnemyCharacter createEnemyCharacter() {
        return new AnnoyingTurtle();
    }
}
