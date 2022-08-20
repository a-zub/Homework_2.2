public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honour, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int addProperties() {
        return nobility + honour + bravery;
    }

    public void comparisonGryffindor(Gryffindor gryffindor) {
        /** Сравниваем студентов*/
        int firstProperties = addProperties();
        int secondProperties = gryffindor.addProperties();
        if (firstProperties > secondProperties) {
            System.out.println("Студент " + getName() + " и студент " +gryffindor.getName() + ": " + firstProperties +
                    " и  " + secondProperties + ".");
        } else if (secondProperties < firstProperties) {
            System.out.println("Студент " + gryffindor.getName() + " и студент " + getName() + ": " + secondProperties +
                    " и  " + firstProperties + ".");
        } else {
            System.out.println("Студент " + gryffindor.getName() + " и студент " + getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
        }
    }

    @Override
    public String toString() {
        return "Gryffindor: " + super.toString() +
                "nobility: " + nobility +
                ", honour: " + honour +
                ", bravery: " + bravery + ".";
    }
}
