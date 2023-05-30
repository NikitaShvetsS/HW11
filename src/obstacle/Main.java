package obstacle;

import member.Cat;
import member.Human;
import member.Member;
import member.Robot;

public class Main {
    public static void main(String[] args) {

        Member[] members = {
                new Human("Tim"),
                new Cat("Tom"),
                new Robot("Bob")
        };
        Obstacle[] obstacles = {
                new Track("Track 1", 100),
                new Wall("Wall 1", 1),
                new Track("Track 2", 200),
                new Wall("Wall 2", 2),
                new Track("Track 3", 500),
                new Wall("Wall 3", 3)
        };

        for (Member member : members) {
            for (Obstacle obstacle : obstacles) {
                if (!member.overcome(obstacle)) {
                    break;
                }
            }
        }
    }
}
