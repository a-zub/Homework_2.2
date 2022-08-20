public class Fuffenuduy extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Fuffenuduy(String name, int magic, int transgression, int industriousness, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

   public int addProperties() {
        return  industriousness + loyalty + honesty;
    }

    public void comparisonFuffenuduy(Fuffenuduy fuffenuduy) {
        /** Сравниваем студентов*/
        int firstProperties = addProperties();
        int secondProperties = fuffenuduy.addProperties();
        if (firstProperties > secondProperties){
            System.out.println("Студент " + getName() + " и студент " + fuffenuduy.getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
        } else if (secondProperties < firstProperties){
            System.out.println("Студент " + fuffenuduy.getName() + " и студент " + getName() + ": " + secondProperties +
                    " и " + firstProperties + ".");
        } else {
            System.out.println("Студент " + fuffenuduy.getName() + " и студент " + getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
        }
    }

    @Override
    public String toString() {
        return "Fuffenuduy: " + super.toString() +
                "industriousness: " + industriousness +
                ", loyalty: " + loyalty +
                ", honesty: " + honesty + ".";
    }
}
