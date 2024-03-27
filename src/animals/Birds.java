package animals;

public class Birds extends WarmBlooded{

    public Birds(String label) {
        super(label, true);
    }

    @Override
    public String toString() {
        return label + " is a Warm-blooded Vertebrates Multicellular Animal with wings";
    }
}
