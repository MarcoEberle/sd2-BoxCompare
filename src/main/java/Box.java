/**
 * Class for boxes of different size and color.
 *
 * @author U.Hammerschall
 */
public class Box implements Comparable<Box> {

    private final int length;    // box length
    private final int width;    // box width
    private final int height;    // box height
    private final Color color;    // box color

    /**
     * Custom-Constructor to create a new box.
     *
     * @param color  of the box
     * @param length of the box
     * @param width  of the box
     * @param height of the box
     * @throws IllegalArgumentException if any of the values is not valid.
     */
    public Box(Color color, int length, int width, int height) {
        if (color == null || length <= 0 || width <= 0 || height <= 0)
            throw new IllegalArgumentException();
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    /**
     * Get length of box.
     *
     * @return length of box
     */
    public int getLength() {
        return length;
    }

    /**
     * Calculates box volume.
     *
     * @return volume of box.
     */
    public int getVolume() {
        return height * width * length;
    }

    /**
     * Calculates ratio between box length and box width.
     *
     * @return ratio
     */
    public double getRatio() {
        return length / (width * 1.0);
    }

    /**
     * Returns box color.
     *
     * @return color
     */
    public Color getColor() {
        return color;
    }

    @Override
    public int compareTo(Box box) {
        return this.getVolume() - box.getVolume();
    }

    @Override
    public String toString() {
        return "[ " + length + ", " + width + ", " + height + ", " + getColor() + "]";
    }
}
