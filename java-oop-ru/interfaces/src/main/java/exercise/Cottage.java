package exercise;

import lombok.Getter;

@Getter
public class Cottage implements Home {
    private final Double area;
    private final Integer floorCount;

    public Cottage(Number area, Number floorCount) {
        this.area = area.doubleValue();
        this.floorCount = floorCount.intValue();
    }

    @Override
    public Integer compareTo(Home other) {
        if (this.getArea() > other.getArea()) {
            return 1;
        }
        if (this.getArea() < other.getArea()) {
            return -1;
        }

        return 0;
    }

    public String toString() {
        return String.format("%d этажный коттедж площадью %0.1f метров", this.getFloorCount(), this.getArea());
    }
}
