package exercise;

public interface Home {
    public Double getArea();

    /**
     * Compare current object to the `other` one
     *
     * @param other
     * @return 1 if current home is larger than other, -1 if smaller, 0 otherwise.
     */
    public Integer compareTo(Home other);
}
