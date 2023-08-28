package vitaliy.grab.testtasks.maze;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static final int ZERO = 0;
    private static Point[][] maze;
    private static Queue<Point> points;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cells = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        maze = new Point[rows][cells];
        Point point;
        int value;
        for (int i = ZERO; i < rows; i++) {
            for (int j = ZERO; j < cells; j++) {
                value = sc.nextInt();
                point = new Point(j, i, value);
                maze[i][j] = point;
            }
        }
        sc.close();
        Point currentPoint = maze[y1][x1];
        currentPoint.distance = 0;
        Point exitPoint = maze[y2][x2];
        points = new LinkedList<>();
        points.offer(currentPoint);
        int distance;
        while (!points.isEmpty()) {
            currentPoint = points.poll();
            if (currentPoint.isVisited) {
                continue;
            } else if (currentPoint.equals(exitPoint)) {
                break;
            } else {
                currentPoint.isVisited = true;
            }
            distance = currentPoint.distance + 1;
            offerPointIfPresent(currentPoint.x, currentPoint.y - 1, distance);
            offerPointIfPresent(currentPoint.x, currentPoint.y + 1, distance);
            offerPointIfPresent(currentPoint.x - 1, currentPoint.y, distance);
            offerPointIfPresent(currentPoint.x + 1, currentPoint.y, distance);
        }
        distance = exitPoint.distance;
        System.out.println(distance == Integer.MAX_VALUE ? 0 : distance);
    }

    private static void offerPointIfPresent(int x, int y, int distance) {
        if (x >= ZERO && x < maze[ZERO].length && y >= ZERO && y < maze.length) {
            Point point = maze[y][x];
            point.distance = distance;
            offerPointIfGate(point);
        }
    }

    private static void offerPointIfGate(Point point) {
        if (point.value == ZERO && !point.isVisited) {
            points.offer(point);
        }
    }

    public static class Point {
        private final int x;
        private final int y;
        private final int value;
        private int distance;
        private boolean isVisited;

        public Point(int x, int y, int value) {
            this.x = x;
            this.y = y;
            this.value = value;
            this.distance = Integer.MAX_VALUE;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Point point = (Point) o;
            return x == point.x && y == point.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
