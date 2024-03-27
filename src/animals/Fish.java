package animals;

public class Fish extends ColdBlooded{

    public Fish(String label) {
        super(label, false, true);
    }

    @Override
    public String toString() {
        return label + " is a Cold-blooded Vertebrates Multicellular Animal who live underwater";
    }
}
