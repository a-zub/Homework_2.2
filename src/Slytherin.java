public class Slytherin extends Hogwarts{
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int magic, int transgression, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public int addProperties() {
        return  cunning + determination + ambition + resourcefulness + lustForPower;
    }

    public void comparisonSlytherin(Slytherin slytherin) {
        /** Сравниваем студентов*/
        int firstProperties = addProperties();
        int secondProperties = slytherin.addProperties();
        if (firstProperties > secondProperties){
            System.out.println("Студент " + getName() + " и студент " + slytherin.getName() + ": " + firstProperties +
                    " и  " + secondProperties + ".");
        } else if (secondProperties < firstProperties){
            System.out.println("Студент " + slytherin.getName() + " и студент " + getName() + ": " + secondProperties +
                    " и  " + firstProperties + ".");
        } else {
            System.out.println("Студент " + slytherin.getName() + " и студент " + getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
        }
    }

    @Override
    public String toString() {
        return "Slytherin: " + super.toString() +
                "cunning: " + cunning  +
                ", determination: " + determination +
                ", ambition: " + ambition +
                ", resourcefulness: " + resourcefulness +
                ", lustForPower: " + lustForPower + ".";
    }
}
