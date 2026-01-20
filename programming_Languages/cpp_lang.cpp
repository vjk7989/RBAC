#include <iostream>
using namespace std;

double calculateDiscount(double price, double discountPercentage) {
    return price * (discountPercentage / 100.0);
}

int main() {
    double itemPrice = 100.0;
    double discountPercent = 20.0;
    
    double discountAmount = calculateDiscount(itemPrice, discountPercent);
    double finalPrice = itemPrice - discountAmount;
    
    cout << "Item Price: $" << itemPrice << endl;
    cout << "Discount: " << discountPercent << "%" << endl;
    cout << "Discount Amount: $" << discountAmount << endl;
    cout << "Final Price: $" << finalPrice << endl;
    
    return 0;
}