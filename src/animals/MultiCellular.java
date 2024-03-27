package animals;

public class MultiCellular extends Animals{

    protected boolean isVertebrates;

    public MultiCellular(String label, boolean isVertebrates) {
        super(label, true);
        this.isVertebrates = isVertebrates;
    }

    @Override
    public String toString() {
        return label + " is a Multicellular Animal";
    }
}
