package homework2;

public class Spa {

//    сделать метод service(Human human), который будет выводить в консоль что этот человек
//    пришел и отдохнул (2 разных вывода)
//    при этом человек должен поспать (уснуть и проснуться) погулять и поесть
//    сделать счетчик который запоминает количество обслуженных людей

    private static int count = 0;

    public static void ShowCount() {
        System.out.println("Обслужено людей: " + count);
    }

    final void service(Human human) {
        System.out.println(human.Name() + " пришел в SPA");
        human.sleep();
        human.sleep();
        human.walk();
        human.eat("spa lunch");
        System.out.println(human.Name() + " отдохнул");

        count++;
    }

    void service(Human human1, Human human2) {
        service(human1);
        service(human2);
    }

    void service(Human human1, Human human2, Human human3) {
        service(human1);
        service(human2);
        service(human3);
    }


}
