package animals;

public class MultiCellular extends Animals{

    private boolean isVertebrates;

    public MultiCellular(String label, boolean isVertebrates) {
        super(label, true);
        this.isVertebrates = isVertebrates;
    }
}
