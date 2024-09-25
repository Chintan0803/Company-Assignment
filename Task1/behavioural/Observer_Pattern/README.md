# Observer Pattern - Stock Price Monitoring

## Pattern Overview
The Observer Pattern is a behavioral design pattern that allows an object, known as the subject, to maintain a list of dependents, known as observers, and automatically notify them of any state changes. It is useful in situations where multiple objects need to stay updated with the state of another object.

## Use Case - Stock Price Monitoring
In this implementation, we have a Stock Market class (subject) that tracks stock prices. The observers are different entities like investors or analysts that want to be notified whenever there is a price update in the stock market. By using this pattern, any changes to the stock prices are automatically pushed to the observers.

### Key Concepts:
- StockMarket: The subject being observed.
- Investor: The observer that gets notified when stock prices change.

This implementation demonstrates how to decouple the logic between the subject and its observers, allowing for flexibility and scalability in notification-based systems.
