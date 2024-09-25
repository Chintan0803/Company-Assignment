# Strategy Pattern - Payment Processing System

## Pattern Overview
The Strategy Pattern is a behavioral design pattern that enables selecting an algorithm at runtime from a family of algorithms. It decouples the algorithm from the context in which it is used, making it easy to switch between different behaviors dynamically.

## Use Case - Payment Processing System
This example implements a Payment Processing System where different payment methods like credit card, PayPal, and Bitcoin can be used. The strategy pattern allows for different payment strategies to be applied without changing the core business logic.

### Key Concepts:
- PaymentContext: The context in which the payment strategy is applied.
- PaymentStrategy: An interface that defines the algorithm to process a payment.
- CreditCardPayment, PaypalPayment, BitcoinPayment: Concrete implementations of different payment methods.

This use case demonstrates how the Strategy Pattern provides flexibility in choosing the best payment method during runtime.
