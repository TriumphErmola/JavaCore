package MasterClass.Collections.SortedCollection;

import org.jetbrains.annotations.NotNull;

public class Stock implements Comparable<Stock> {

    private final String title;
    private double valuePrice;
    private int summaNaOstatkah = 0;
    private int rezerv = 0;

    public Stock(String title, double valuePrice) {
        this.title = title;
        this.valuePrice = valuePrice;
        this.summaNaOstatkah = 0;
    }

    public Stock(String title, double valuePrice, int summaNaOstatkah) {
        this.title = title;
        this.valuePrice = valuePrice;
        this.summaNaOstatkah = summaNaOstatkah;
    }

    public String getTitle() {
        return title;
    }

    public double getValuePrice() {
        return valuePrice;
    }

    public int AvailableOstatok() {
        return summaNaOstatkah - rezerv;
    }

    public void setValuePrice(double valuePrice) {
        if (valuePrice > 0.0) {
            this.valuePrice = valuePrice;
        }

    }

    public void regulirovkaZapasa(int kolichestvo) {
        int newKolichestvo = this.summaNaOstatkah + kolichestvo;
        if (newKolichestvo >= 0) {
            this.summaNaOstatkah = newKolichestvo;
        }
    }

    public int rezervStock(int kolichestvo) {
        if (kolichestvo <= AvailableOstatok()) {
            rezerv += kolichestvo;
            return kolichestvo;
        }
        return 0;
    }

    public int unRezervStock(int kolichestvo) {
        if (kolichestvo <= rezerv) {
            rezerv -= kolichestvo;
            return kolichestvo;
        }
        return 0;
    }

    public int ItogPoOstatku(int kolichestvo) {
        if (kolichestvo <= rezerv) {
            summaNaOstatkah -= kolichestvo;
            rezerv -= kolichestvo;
            return kolichestvo;
        }
        return 0;
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
//        System.out.println("Entering Stock.compareTo");
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
        return this.title + " : price " + this.valuePrice + ". Reserved: " + this.rezerv;
    }
}
