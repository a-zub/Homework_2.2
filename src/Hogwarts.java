// Homework_2.2
// @ Aleksandar Zubanov
// 2022/08/20


public abstract class Hogwarts {
    private String name;
    private int magic;
    private int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public int addProperties(){
        /** Вычисляем свойства студента*/
        return magic + transgression;
    }
    public void comparisonHogwarts(Hogwarts hogwarts) {
        /** Сравниваем студентов*/
        int firstProperties = addProperties();
        int secondProperties = hogwarts.addProperties();
        if (firstProperties > secondProperties){
            System.out.println("Студент " + getName() + " и студент " + hogwarts.getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
        } else if (secondProperties < firstProperties){
            System.out.println("Студент " + hogwarts.getName() + " и студент " + getName() + ": " + secondProperties +
                    " и " + firstProperties + ".");
    } else {
            System.out.println("Студент " + hogwarts.getName() + " и студент " + getName() + ": " + firstProperties +
                    " и " + secondProperties + ".");
         }
    }

    @Override
    public String toString() {
        return "name: '" + name + '\'' +
                ", magic: " + magic +
                ", transgression: " + transgression +
                ".";
    }
}
