package adapter;

public class SkeletorPappa extends MoominCharacter{
    Skeletor skeletor = new Skeletor();
    private String characteristic = "an oddly lanky body figure, but with a topper hat";

    @Override
    public String getName() {
        return skeletor.getName();
    }

    @Override
    public String getCharacteristic() {
        return characteristic;
    }

}
