package MasterClass.Collections.SortedCollection;

import org.jetbrains.annotations.NotNull;

public class Stock implements Comparable<Stock> {

    private final String title;
    private double valuePrice;
    private int kolichestvo = 0;

    public Stock(String title, double valuePrice) {
        this.title = title;
        this.valuePrice = valuePrice;
        this.kolichestvo = 0;
    }

    public Stock(String title, double valuePrice, int kolichestvo) {
        this.title = title;
        this.valuePrice = valuePrice;
        this.kolichestvo = kolichestvo;
    }

    public String getTitle() {
        return title;
    }

    public double getValuePrice() {
        return valuePrice;
    }

    public int getKolichestvo() {
        return kolichestvo;
    }

    public void setValuePrice(double valuePrice) {
        if (valuePrice > 0.0) {
            this.valuePrice = valuePrice;
        }

    }

    public void regulirovkaZapasa(int kolichestvo) {
        int newKolichestvo = this.kolichestvo + kolichestvo;
        if (newKolichestvo >= 0) {
            this.kolichestvo = newKolichestvo;
        }
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Entering Stock.equals");
        if (o == this) {
            return true;
        }
        if ((o == null) || (o.getClass() != this.getClass())) {
            return false;
        }
        String oName = ((Stock) o).getTitle();
        return this.title.equals(oName);
    }

    @Override
    public int hashCode() {
        return this.title.hashCode() + 57;
    }

    @Override
    public int compareTo(@NotNull Stock o) {
        System.out.println("Entering Stock.compareTo");
        if (this == o) {
            return 0;
        }
        if (o != null) {
            return this.title.compareTo(o.getTitle());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.title + " : price " + this.valuePrice;
    }
}
