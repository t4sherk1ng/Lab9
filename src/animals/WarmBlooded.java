package animals;

public class WarmBlooded extends Vertebrates{

    protected boolean hasWings;

    public WarmBlooded(String label, boolean hasWings) {
        super(label, true);
        this.hasWings = hasWings;
    }

    @Override
    public String toString() {
        return label + " is a Vertebrates Multicellular Animal with warm blood";
    }
}
