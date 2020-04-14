package adapter;

public class SkeletorPappa extends MoominCharacter{
    private Skeletor skeletor = new Skeletor();
    private String name = "";
    private String characteristic = "an oddly lanky body figure, but with a topper hat";

    @Override
    public String getName() {
        if (name.equals("")) {
            String[] nameArray = skeletor.getName();
            for (String s : nameArray) {
                name += s;
            }
        }
        return name;
    }

    @Override
    public String getCharacteristic() {
        return characteristic;
    }

}
