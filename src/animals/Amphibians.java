package animals;

public class Amphibians extends ColdBlooded{

    public Amphibians(String label) {
        super(label, true, true);
    }

    @Override
    public String toString() {
        return label + " is a Cold-blooded Vertebrates, Multicellular Animal that live on land and underwater";
    }
}
