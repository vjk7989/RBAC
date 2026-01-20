import math

def find_average(numbers):
    """Calculate the average of a list of numbers"""
    return sum(numbers) / len(numbers) if numbers else 0

def find_square_root(number):
    """Calculate the square root of a number"""
    return math.sqrt(number)

def print_primes(limit):
    """Print all prime numbers up to the given limit"""
    primes = []
    for num in range(2, int(limit) + 1):
        is_prime = True
        for i in range(2, int(math.sqrt(num)) + 1):
            if num % i == 0:
                is_prime = False
                break
        if is_prime:
            primes.append(num)
    
    print(f"Primes up to {limit}: {primes}")
    return primes

# Example usage
if __name__ == "__main__":
    numbers = [10, 20, 30, 40, 50]
    
    avg = find_average(numbers)
    print(f"Average: {avg}")
    
    sqrt_avg = find_square_root(avg)
    print(f"Square root of average: {sqrt_avg}")
    
    print_primes(sqrt_avg)