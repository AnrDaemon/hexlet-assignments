package exercise;

import lombok.Getter;

@Getter
public class Flat implements Home {
    private final Double livingArea;
    private final Double balconyArea;
    private final Integer floor;
    private Double area;

    public Flat(Number livingArea, Number balconyArea, Number floor) {
        this.livingArea = livingArea.doubleValue();
        this.balconyArea = balconyArea.doubleValue();
        this.floor = floor.intValue();
    }

    @Override
    public Double getArea() {
        if (area == null) {
            area = livingArea + balconyArea;
        }

        return area;
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
        return String.format("Квартира площадью %0.1f метров на %d этаже", this.getArea(), this.getFloor());
    }
}
