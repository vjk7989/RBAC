#include <stdio.h>

// Function to calculate discount
double calculateDiscount(double itemPrice, double discountPercentage) {
    if (itemPrice < 0 || discountPercentage < 0 || discountPercentage > 100) {
        printf("Error: Invalid input!\n");
        return -1;
    }
    
    double discountAmount = (itemPrice * discountPercentage) / 100;
    return discountAmount;
}

// Function to calculate final price after discount
double calculateFinalPrice(double itemPrice, double discountPercentage) {
    double discountAmount = calculateDiscount(itemPrice, discountPercentage);
    
    if (discountAmount == -1) {
        return -1;
    }
    
    return itemPrice - discountAmount;
}

int main() {
    double price, discount;
    
    printf("=== Discount Calculator ===\n");
    printf("Enter item price: $");
    scanf("%lf", &price);
    
    printf("Enter discount percentage (%%): ");
    scanf("%lf", &discount);
    
    double discountAmount = calculateDiscount(price, discount);
    
    if (discountAmount != -1) {
        double finalPrice = calculateFinalPrice(price, discount);
        
        printf("\n--- Results ---\n");
        printf("Original Price: $%.2lf\n", price);
        printf("Discount Percentage: %.2lf%%\n", discount);
        printf("Discount Amount: $%.2lf\n", discountAmount);
        printf("Final Price: $%.2lf\n", finalPrice);
    }
    
    return 0;
}
