import java.util.Random;

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Gryffindor harry = addGryffindorStudent("Гарри Потер");
        Gryffindor hermione = addGryffindorStudent("Гермиона Грейнджер");
        Gryffindor ron = addGryffindorStudent("Рон Уизли");

        Fuffenuduy zacharias = addFuffenuduyStudent("Захария Смит");
        Fuffenuduy cedric = addFuffenuduyStudent("Седрик Диггори");
        Fuffenuduy justin = addFuffenuduyStudent("Джастин Финч-Флетчли");

        Ckocktervan zhou = addCkocktervanStudent("Чжоу Чанг");
        Ckocktervan padma = addCkocktervanStudent("Падма Патил");
        Ckocktervan marcus =addCkocktervanStudent("Маркус Белби");

        Slytherin darko = addSlytherinStudent("Драко Малфой");
        Slytherin graham = addSlytherinStudent("Грэхэм Монтегю");
        Slytherin gregory = addSlytherinStudent("Грегори Гойл");

        harry.print();
        hermione.print();
        ron.print();

        zacharias.print();
        cedric.print();
        justin.print();

        zhou.print();
        padma.print();
        marcus.print();

        darko.print();
        graham.print();
        gregory.print();

        harry.comparisonHogwarts(darko);
        harry.comparisonGryffindor(ron);
        cedric.comparisonFuffenuduy(justin);

    }

    private static Gryffindor addGryffindorStudent(String name) {
        return new Gryffindor (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }

    private static Fuffenuduy addFuffenuduyStudent(String name) {
        return new  Fuffenuduy(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }

    private static Ckocktervan addCkocktervanStudent(String name) {
        return new Ckocktervan(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }

    private static Slytherin addSlytherinStudent(String name) {
        return new Slytherin(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
                );
    }
}