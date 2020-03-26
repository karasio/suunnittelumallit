package singleton;

public class PokemonFactory implements GameCharacterFactory {
    // SINGLETON
    private PokemonFactory() {}
    private static PokemonFactory PF = new PokemonFactory();
    public static PokemonFactory getInstance() {
        return PF;
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
