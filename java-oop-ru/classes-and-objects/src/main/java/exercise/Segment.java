package exercise;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Segment {
    private final Point beginPoint;
    private final Point endPoint;
    private Point midPoint;

    public Point getMidPoint() {
        if (midPoint == null) {
            midPoint = new Point((beginPoint.getX() + endPoint.getX()) / 2, (beginPoint.getY() + endPoint.getY()) / 2);
        }

        return midPoint;
    }
}
