package animals;

public class Animals {

    protected String label;
    protected boolean isMulticellular;

    public Animals(String label, boolean isMulticellular) {
        if (isCorrectLabel(label)) {
            this.label = label;
        } else {
            throw new IllegalArgumentException("Invalid value. Try again");
        }
        this.isMulticellular = isMulticellular;
    }

    public boolean isCorrectLabel(String label) {
        return label.length() >= 2;
    }



    //FIXME switch to StringBuilder
    @Override
    public String toString() {
        return "Animals{" +
                "label='" + label + '\'' +
                ", isMulticellular=" + isMulticellular +
                '}';
    }
}
