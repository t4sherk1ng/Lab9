package animals;

public class ColdBlooded extends Vertebrates{

    protected boolean isLivesOnLand;
    protected boolean isLivesUnderwater;

    public ColdBlooded(String label, boolean isLivesOnLand, boolean isLivesUnderwater) {
        super(label, false);
        this.isLivesOnLand = isLivesOnLand;
        this.isLivesUnderwater = isLivesUnderwater;
    }

    @Override
    public String toString() {
        return label + " is a Vertebrates Multicellular Animals without warm blood";
    }
}
