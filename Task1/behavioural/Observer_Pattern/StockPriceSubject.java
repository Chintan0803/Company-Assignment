import java.util.ArrayList;
import java.util.List;

public class StockPriceSubject {
    private List<StockObserver> observers = new ArrayList<>();
    private double price;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        observers.remove(observer);
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update(price);
        }
    }
}
