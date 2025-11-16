package pluralsight.models;

public class Drink  extends MenuItem{

    private String size;
    private String flavor;

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double getPrice() {
        return switch (this.size.toLowerCase()){
            case "small" -> 2.0;
            case "medium" -> 3.0;
            case "large" -> 4.0;
            case "xlarge" -> 5.0;
            default -> 0;
        };
    }

    public String toString() {
        return size.substring(0,1).toUpperCase() + size.substring(1) + " " + flavor + " - $" + String.format("%.2f", getPrice());
    }
}

