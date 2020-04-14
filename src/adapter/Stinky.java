package adapter;

public class Stinky extends MoominCharacter {
    private final String NAME = "Stinky";
    private String characteristic = "fuzzy brown body hair and antenna-like ears";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getCharacteristic() {
        return characteristic;
    }
}
