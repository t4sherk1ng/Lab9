package animals;

public class Invertebrates extends MultiCellular{

    protected boolean hasLegs;

    public Invertebrates(String label, boolean hasLegs) {
        super(label, false);
        this.hasLegs = hasLegs;
    }

    @Override
    public String toString() {
        return label + " is a Multicellular Animal without backbone";
    }
}
