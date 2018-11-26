package lesson1;

import lesson1.Competitors.*;
import lesson1.obstacles.*;

public class MainClass {
    public static void main(String[] args) {


        Team team = new Team("A", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"),
                new Cat("Рыжик"));
        Course course = new Course(new Cross(400), new Wall(2), new Water(1));
        course.doIt(team);
        team.showResult();

    }
}
