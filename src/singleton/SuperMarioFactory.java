package singleton;

public class SuperMarioFactory implements GameCharacterFactory {
    // SINGLETON
    private SuperMarioFactory() {}
    private static SuperMarioFactory SMF = new SuperMarioFactory();
    public static SuperMarioFactory getInstance() {
        return SMF;
    }

    @Override
    public IMainCharacter createMainCharacter() { return new Mario(); }

    @Override
    public IEnemyCharacter createEnemyCharacter() {
        return new AnnoyingTurtle();
    }
}
