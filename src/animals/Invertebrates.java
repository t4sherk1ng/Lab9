package animals;

public class Invertebrates extends MultiCellular{

    private boolean hasLegs;

    public Invertebrates(String label, boolean hasLegs) {
        super(label, false);
        this.hasLegs = hasLegs;
    }
}
