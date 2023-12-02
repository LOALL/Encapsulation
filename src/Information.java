public class Information {

    private final Dimensions dimensions;
    private final double weight;
    private final String address;
    private final boolean flip;
    private final String registratioNumber;
    private final boolean fragile;

    public Information(Dimensions dimensions, double weight, String address, boolean flip,
                       String registratioNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.flip = flip;
        this.registratioNumber = registratioNumber;
        this.fragile = fragile;
    }

    public Information() {
        this.dimensions = null;
        weight = 0;
        address = "N/A";
        flip = false;
        registratioNumber = "N/A";
        fragile = false;

    }
      //Getter
    public Dimensions  getDimensions() {
        return dimensions;
    }

    public double getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public boolean getFlip() {
        return flip;
    }

    public String getRegistratioNumber() {
        return registratioNumber;
    }

    public boolean getFragile() {
        return fragile;
    }

    //Setter

    public Information setDimensions(Dimensions dimensions) {
        return new Information(dimensions, weight, address, flip, registratioNumber, fragile);
    }
    public Information setFragile(boolean fragile) {
        return new Information(dimensions, weight, address, flip, registratioNumber, fragile);
    }

    public Information setRegistratioNumber(String registratioNumber) {
        return new Information(dimensions,weight, address, flip, registratioNumber, fragile);
    }

    public Information setFlip(boolean flip) {
        return new Information(dimensions, weight, address, flip, registratioNumber, fragile);
    }

    public Information setAddress(String address) {
        return new Information(dimensions, weight, address, flip, registratioNumber, fragile);
    }

    public Information setWeight(double weight) {
        return new Information(dimensions, weight, address, flip, registratioNumber, fragile);
    }

    @Override
    public String toString() {
        return "Информация о доставке:  " + "\n" +
                "Объём: " + dimensions + "\n" +
                "Масса: " + weight + "кг." + "\n" +
                "Адресс доставки: " + address + "\n" +
                "Можно ли переварачивать: " + flip + "\n" +
                "Номер регистрации: " + registratioNumber + "\n" +
                "Хрупкий груз: " + fragile;
    }
}
