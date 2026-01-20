import math

def calculate_average(numbers):
    """Calculate average of given numbers"""
    if len(numbers) == 0:
        return 0
    return sum(numbers) / len(numbers)

def is_prime(num):
    """Check if a number is prime"""
    if num < 2:
        return False
    if num == 2:
        return True
    if num % 2 == 0:
        return False
    for i in range(3, int(math.sqrt(num)) + 1, 2):
        if num % i == 0:
            return False
    return True

def print_primes_up_to(n):
    """Print all prime numbers up to n"""
    primes = []
    for num in range(2, int(n) + 1):
        if is_prime(num):
            primes.append(num)
    return primes

def main():
    print("=== Average, Square Root, and Prime Number Finder ===\n")
    
    # Get input from user
    try:
        user_input = input("Enter numbers separated by spaces: ")
        numbers = [float(x) for x in user_input.split()]
        
        if len(numbers) == 0:
            print("No numbers entered!")
            return
        
        # Calculate average
        average = calculate_average(numbers)
        print(f"\nNumbers: {numbers}")
        print(f"Average: {average:.2f}")
        
        # Calculate square root
        if average < 0:
            print("Error: Cannot calculate square root of negative number!")
            return
        
        sqrt_value = math.sqrt(average)
        print(f"Square Root of Average: {sqrt_value:.2f}")
        
        # Get primes up to square root
        primes = print_primes_up_to(sqrt_value)
        
        print(f"\n--- Prime Numbers up to {sqrt_value:.2f} ---")
        if primes:
            print(f"Primes: {primes}")
            print(f"Total primes found: {len(primes)}")
        else:
            print("No prime numbers found in this range.")
        
        # Additional statistics
        print(f"\n--- Statistics ---")
        print(f"Number count: {len(numbers)}")
        print(f"Min value: {min(numbers)}")
        print(f"Max value: {max(numbers)}")
        
    except ValueError:
        print("Error: Please enter valid numbers!")

if __name__ == "__main__":
    main()
