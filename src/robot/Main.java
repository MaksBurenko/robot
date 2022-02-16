package robot;

import java.awt.*;

public class Main {

    public static void main(Robot robot, int toX, int toY) {

        if(robot.getDirection() == Direction.UP){
            robot.turnLeft();
        } else {
            if(robot.getDirection() == Direction.DOWN){
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

        if (x < toX) {
            while (x < toX) {
                robot.stepForward();
                x++;
            }
            if (x==toX) {
                robot.turnLeft();
            }
        } else {
            if (x > toX) {
                robot.turnLeft();
                robot.turnLeft();
                while (x > toX) {
                    robot.stepForward();
                    x++;
                }
                if (x==toX) {
                    robot.turnRight();
                }
            }
        }

        if (y < toY) {
            while (y < toY) {
                robot.stepForward();
                y++;
            }
            if (y==toY) {
                System.out.println("Finish");
                System.out.println("Robot coordinates" + "X=" + toX + "Y=" + toY);
            }
        } else {
            if (y > toY) {
                robot.turnLeft();
                robot.turnLeft();
                while (y > toY) {
                    robot.stepForward();
                    y++;
                }
                if (y==toY) {
                    System.out.println("Finish");
                    System.out.println("Robot coordinates" + "X=" + toX + "Y=" + toY);
                }
            }
        }
    }
}
