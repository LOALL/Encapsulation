public class Dimensions {
    private final int height;
    private final int length;
    private final int width;
    public Dimensions() {
        height = 0;
        length = 0;
        width = 0;
    }

    public Dimensions(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(height, length, width);
    }

    public int getLength() {
        return length;
    }

    public Dimensions setLength(int length) {
        return new Dimensions(height, length, width);
    }

    public int getWidth() {
        return width;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(height, length, width);
    }

    public int countingVolume() {
        return height * length * width;
    }

    @Override
    public String toString() {
        return countingVolume() + "\n"
                + "Размеры посылки: " + "\n"
                + "Высота: " + height + " мм." + "\n"
                + "Длина: " + length + " мм." + "\n"
                + "Ширина: " + width+ " мм.";
    }
}
