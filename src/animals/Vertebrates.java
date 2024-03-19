package animals;

public class Vertebrates extends MultiCellular{

    protected boolean hasWarmBlood;

    public Vertebrates(String label, boolean hasWarmBlood) {
        super(label, true);
        this.hasWarmBlood = hasWarmBlood;
    }
}
