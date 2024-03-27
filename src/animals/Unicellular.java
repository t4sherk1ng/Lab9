package animals;

public class Unicellular extends Animals{

    public Unicellular(String label) {
        super(label, false);
    }

    @Override
    public String toString() {
        return label + " is a Unicellular Animal";
    }
}
