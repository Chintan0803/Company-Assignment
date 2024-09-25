public class StockMonitorApp implements StockObserver {
    private String stockName;

    public StockMonitorApp(String stockName) {
        this.stockName = stockName;
    }

    @Override
    public void update(double price) {
        System.out.println("Price of " + stockName + " has updated to: $" + price);
    }

    public static void main(String[] args) {
        StockPriceSubject subject = new StockPriceSubject();
        StockMonitorApp app1 = new StockMonitorApp("AAPL");
        StockMonitorApp app2 = new StockMonitorApp("GOOG");

        subject.addObserver(app1);
        subject.addObserver(app2);

        subject.setPrice(150.0);
        subject.setPrice(152.5);
    }
}
