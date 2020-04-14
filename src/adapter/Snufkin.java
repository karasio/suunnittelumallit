package adapter;

public class Snufkin extends MoominCharacter {
    private final String NAME = "Snufkin";
    private String characteristic = "a green hat with a feather and a pipe";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getCharacteristic() {
        return characteristic;
    }
}
