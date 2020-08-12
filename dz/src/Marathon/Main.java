package Marathon;

import Marathon.Competitor.Animal.Cat;
import Marathon.Competitor.Animal.Dog;
import Marathon.Competitor.Competitor;
import Marathon.Competitor.Human;
import Marathon.Competitor.Team;
import Marathon.Course.*;

public class Main {
        public static void main(String[] args) {

            Competitor[] competitors = {new Human("Боб"), new Cat("Барсик"), new Dog("Блохастик"), new Dog("Ганс")};
            Obstacle[] obstacles = {new Cross(400), new Wall(2), new Water(1)};

            Team team = new Team("Победители", competitors);

            System.out.println("Новая команда");
            System.out.println(team.getTeamName());

            System.out.println("Члены команды");
            team.showResults();

            Course course = new Course(obstacles);

            System.out.println("Преодоление испытаний");
            course.doIt(team);

            System.out.println("Результаты команды");
            team.showResults();

        }
    }

