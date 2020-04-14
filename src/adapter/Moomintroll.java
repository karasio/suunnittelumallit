package adapter;

public class Moomintroll extends MoominCharacter {
    private final String NAME = "Moomintroll";
    private String characteristic = "a hippopotamus like body and blue eyes";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getCharacteristic() {
        return characteristic;
    }

}
