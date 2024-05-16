package ru.job4j.tracker.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {

    @Test
    public void testDistanceBetweenTwoPointsIn2dSpace() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        double distance = point1.distance(point2);
        assertThat(distance).isCloseTo(distance, offset(0.001));
    }

    @Test
    public void testDistance3dPositiveCoordinates() {
        Point point1 = new Point(1, 2, 3);
        Point point2 = new Point(4, 5, 6);
        double result = point1.distance3d(point2);
        assertThat(result).isCloseTo(5.196, offset(0.001));
    }
}