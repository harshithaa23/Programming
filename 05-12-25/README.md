# Programming 06 – Factors & Prime Check (Java)

This project contains Java programs that demonstrate how to:
- Print all factors of a given integer.
- Count the number of factors of an integer.
- Check whether a given integer is a prime number using an optimized approach. [file:1]

The code is structured to reinforce method creation, parameter passing, return types, and basic optimization using loops and conditional statements. [file:1]

---

## Features

- **Print factors of a number**  
  Uses a `for` loop and the modulus operator to print all factors between 1 and `n`. [file:1]

- **Count number of factors**  
  Reuses the factor logic to count how many factors a number has instead of printing them. [file:1]

- **Prime number check (optimized)**  
  - A number is considered prime if it has exactly two factors: 1 and the number itself.  
  - The algorithm checks divisibility only from 2 up to `n / 2` to reduce the number of iterations.  
  - As soon as a divisor is found, the method returns `"Not Prime"` early.  
  - If no divisor is found in the loop, the method returns `"Prime"`. [file:1]

---

## How it works

1. The user enters an integer `n` from the console. [file:1]  
2. The program:
   - Prints all factors of `n`.
   - Prints the total number of factors.
   - Prints whether `n` is a prime number or not. [file:1]

Core ideas used:
- `for` loops for iterating from 1 to `n` (or 2 to `n / 2` for prime check). [file:1]  
- `%` (modulus) operator to test divisibility.  
- Methods with parameters and return types to keep code modular and readable. [file:1]  

---

## Files

- `MainPrimeDemo.java`  
  Contains:
  - `printFactors(int n)`
  - `countFactors(int n)`
  - `checkPrime(int n)`
  - `main` method to interact with the user and display results. [file:1]

---

## Example

Input:
Enter a number: 10


Output:
Factors of 10: 1 2 5 10
Number of factors: 4
Prime check: Not Prime


---

## How to run

1. Compile:
javac MainPrimeDemo.java


2. Run:
java MainPrimeDemo


3. Enter an integer when prompted and observe:
- The list of factors
- The count of factors
- Whether the number is prime or not [file:1]  
