package somepackage;

public class Rehtori extends AterioivaOtus {
    @Override
    public Juoma createJuoma() {
        return new Kahvi();
    }
}
