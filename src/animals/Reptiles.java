package animals;

public class Reptiles extends ColdBlooded{

    public Reptiles(String label) {
        super(label, true, false);
    }

    @Override
    public String toString() {
        return label + " is a Vertebrates Multicellular Animal with who live on land";
    }
}
