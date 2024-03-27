package animals;

public class Mammals extends WarmBlooded{

    public Mammals(String label, boolean hasWings) {
        super(label, true);
    }

    @Override
    public String toString() {
        return label + " is a Warm-blooded Vertebrates Multicellular Animal without wings";
    }
}
