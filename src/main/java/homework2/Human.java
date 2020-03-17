package homework2;

public class Human {

    private final String name;
    private double height; // (в метрах)
    private double weight;
    private int age;
    private final String nationality;
    private boolean isSleep = false;

    private static int count = 0;

    private static void increment() {
        count++;
    }

    public static void ShowCount() {
        System.out.println("The amount of humans created: " + count);
    }

    public Human() {
        name = "DefaultHuman";
        height = 1.7;
        weight = 60;
        age = 30;
        nationality = "Russian";
        increment();
    }

    public Human(String name, double height, double weight, int age, String nationality) {

        if (height > 3) {
            throw new IllegalArgumentException("Input parameters are not valid! Укажите рост человека в метрах");
        }

        if (age <= 0 || weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Input parameters are not valid! Вес, рост и возвраст должны быть > 0");
        }
        if (weight > 300) {
            throw new IllegalArgumentException("Too heavy! Are you sure you mean kilograms?");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Too old. You have no medical equipment to make such an old person");
        }
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.nationality = nationality;

        increment();
    }

//    представиться - introduce() - выводит в консоль сообщение - где вежливо сообщается информация о имени возврасте и национальности
//    есть - eat(String foodName) - выводит в консоль - name съел еду foodName
//    ходить - walk() - выводит в консоль - name погулял
//    спать - sleep() выводит в консоль - name лег спать
//    спать - sleep() выводит в консоль - name проснулся

    boolean isNowSleeping() {
        if (isSleep) {
            System.out.println("Shh... " + name + " is sleeping");
        }
        return isSleep;
    }

    void introduce() {
        if (isNowSleeping()) {
            return;
        }
        System.out.println("Hello, my name is " + name + ". Nice to meet you!");
    }

    void eat(String foodName) {
        if (isNowSleeping()) {
            return;
        }
        System.out.println(name + " съел " + foodName);
    }

    void walk() {
        if (isNowSleeping()) {
            return;
        }
        System.out.println(name + " погулял");
    }

    void sleep() {
        String msg = name + " ";
        msg += isSleep ? "проснулся" : "лег спать";
        System.out.println(msg);
        isSleep = !isSleep;
    }

    //    возвращает коэффициент массы тела над сигнатурой метода подумайте сами
//            (масса деленная на (рост в квадрате))
    double body_mass_ratio() {
        return weight / (height * height);
    }

    String Name() {
        return name;
    }

    String Nationality() {
        return nationality;
    }

}
