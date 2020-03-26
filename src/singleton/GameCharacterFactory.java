package singleton;

public interface GameCharacterFactory {
    public IMainCharacter createMainCharacter();
    public IEnemyCharacter createEnemyCharacter();
}
