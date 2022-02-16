package robot;

import java.awt.*;

public class Main {

    public static void main(Robot robot, int toX, int toY) {

        if(robot.getDirection() == Direction.RIGHT){
            robot.turnLeft();
        } else {
            if(robot.getDirection() == Direction.LEFT){
                robot.turnRight();
            } else {
                if(robot.getDirection() == Direction.DOWN){
                    robot.turnLeft();
                    robot.turnLeft();
                }
            }
        }

        int x = robot.getX();
        int y = robot.getY();

        if (y > toY) {
            while (y > toY) {
                robot.stepForward();
                y--;
            }
            robot.turnLeft();
        } else {
            if (y < toY) {
                robot.turnLeft();
                robot.turnLeft();
                while (y < toY) {
                    robot.stepForward();
                    y++;
                }
                robot.turnRight();
            }
        }

        if (x < toX) {
            while (x < toX) {
                robot.stepForward();
                x++;
            }
        } else {
            if (x > toX) {
                robot.turnLeft();
                robot.turnLeft();
                while (x > toX) {
                    robot.stepForward();
                    x--;
                }
            }
        }
    }
}
