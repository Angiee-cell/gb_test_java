import java.util.Objects;

public class Laptop {

    private int ram; // озу в гб
    private int hdd; // объем жд в гб
    private String os; // операционная система
    private String color; // цвет

    public Laptop(int ram, int hdd, String os, String color) {
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "module6.laptop{" + "RAM" + "GB" + ", HDD=" + hdd + " GB" + ", OS=" + os + "\'" + ", Colors=" + color
                + "\'" + "}";
    }

    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Laptop laptop = (Laptop) o;

        return ram == laptop.ram && hdd == laptop.hdd && os.equals(laptop.os) && color.equals(laptop.color);

    }

    public int hashCode() {
        return Objects.hash(ram, hdd, os, color);
    }
}