package OOPs.PracticeQuestions;

import OOPs.Inheritence.A;

import java.util.Stack;

public class AddFractions {
    int num; // Numerator
    int den; // Denominator

    // Constructor to initialize the fractions and simplify them
    AddFractions(int n, int d) {
        this.num = n;
        this.den = d;
        simplify(); // Simplify the fraction upon creation
    }

    // Method to find the highest common factor (HCF)
    int findHcf(int num, int den) {
        int min = Math.min(num, den); // Find the smaller of numerator or denominator
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && den % i == 0) {
                return i; // Return the highest number that divides both
            }
        }
        return 1; // Return 1 if no other common factor found
    }

    // Method to simplify the fraction
    void simplify() {
        int hcf = findHcf(num, den); // Find the HCF
        num /= hcf; // Divide numerator by HCF
        den /= hcf; // Divide denominator by HCF
    }

    // Static method to add two fractions
    public static AddFractions add(AddFractions f1, AddFractions f2) {
        int newNum = f1.num * f2.den + f1.den * f2.num; // Cross multiply and add for numerator
        int newDen = f1.den * f2.den; // Multiply denominators
        return new AddFractions(newNum, newDen); // Return new simplified fraction
    }

    // Main method to test the AddFractions class
    public static void main(String[] args) {
        AddFractions f1 = new AddFractions(35, 21);
        System.out.println(f1.num + "/" + f1.den); // Output simplified fraction
        AddFractions f2 = new AddFractions(7, 21);
        System.out.println(f2.num + "/" + f2.den); // Output simplified fraction
        AddFractions result = add(f1, f2);
        System.out.println("Sum: " + result.num + "/" + result.den); // Output result of addition
    }
}

