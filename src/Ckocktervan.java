public class Ckocktervan extends Hogwarts{
    private int mind;
    private int wisdom;

    private int wit;
    private int creation;

    public Ckocktervan(String name, int magic, int transgression, int mind, int wisdom, int wit, int creation) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int addProperties() {
        return  mind + wisdom + wit + creation;
    }

    public void comparisonCkocktervan(Ckocktervan ckocktervan) {
        /** Сравниваем студентов*/
        int firstProperties = addProperties();
        int secondProperties = ckocktervan.addProperties();
        if (firstProperties > secondProperties){
            System.out.println("Студент " + getName() + "" + ckocktervan.getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
        } else if (secondProperties < firstProperties){
            System.out.println("Студент " + ckocktervan.getName() + "" + getName() + ": " + secondProperties +
                    " и  " + firstProperties + ".");
        } else {
            System.out.println("Студент " + ckocktervan.getName() + "" + getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
        }
    }

    @Override
    public String toString() {
        return "Ckocktervan: " +  super.toString() +
                "mind: " + mind +
                ", wisdom: " + wisdom +
                ", wit: " + wit +
                ", creation: " + creation + ".";
    }
}
