package homework2;

public class Main {

    public static void main(String[] args) {

        Human[] humans = new Human[5];

        humans[0] = new Human("Anya", 1.3, 52, 23, "Russian");
        humans[1] = new Human("Sveta", 1.8, 48, 70, "Chineese");
        humans[2] = new Human("Kolya", 0.6, 109, 99, "Arab");
        humans[3] = new Human("Nastya", 2.2, 24, 18, "Tatary");
        humans[4] = new Human("Petya", 3, 88, 55, "Uzbek");


        for (Human h : humans) {
            h.introduce();
        }

        // направить всех людей в спа (вызвать метод спа для каждого человека)
        Spa spa = new Spa();// = new Spa();

        for (Human h : humans) {
            spa.service(h);
        }
        spa.ShowCount();
        Human.ShowCount();
    }

}
