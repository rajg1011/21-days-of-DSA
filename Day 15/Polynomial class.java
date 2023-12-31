
// Implement a polynomial class, that contains following functions -
// 1. setCoefficient -
// This function sets coefficient for a particular degree value. If term with given degree is not there in the polynomial, then corresponding term (with specified degree and value) is added. If the term is already present in the polynomial, then previous coefficient value is replaced by given coefficient value.
// 2. add -
// Adds two polynomials and returns a new polynomial which has the result.
// 3. subtract -
// Subtracts two polynomials and returns a new polynomial which has the result.
// 4. multiply -
// Multiplies two polynomials and returns a new polynomial which has the result.
// 5. print -
// Prints all the terms (only terms with non zero coefficients are to be printed) in increasing order of degree.
// Print pattern for a single term : "x"
// And multiple terms should be printed separated by space. For more clarity, refer sample test cases.
// Note : Only keep those terms which have non - zero coefficients.
import java.util.Scanner;
import java.util.ArrayList;

public class Polynomial {
    int coefficient[] = new int[100];

    public void setCoefficient(int degree, int coeff) {

        coefficient[degree] = coeff;
    }

    // Prints all the terms(only terms with non zero coefficients are to be printed)
    // in increasing order of degree.
    public void print() {
        for (int i = 0; i < coefficient.length; i++) {
            if (coefficient[i] != 0) {
                System.out.print(coefficient[i] + "x" + i + " ");
            }
        }
    }

    // Adds two polynomials and returns a new polynomial which has result
    public Polynomial add(Polynomial p) {
        for (int i = 0; i < this.coefficient.length; i++) {
            for (int j = 0; j < p.coefficient.length; j++) {
                if (i == j && (this.coefficient[i] != 0 || p.coefficient[j] != 0)) {
                    this.coefficient[i] += p.coefficient[j];
                }
            }
        }
        return this;

    }

    // Subtracts two polynomials and returns a new polynomial which has result
    public Polynomial subtract(Polynomial p) {
        for (int i = 0; i < this.coefficient.length; i++) {
            for (int j = 0; j < p.coefficient.length; j++) {
                if (i == j && (this.coefficient[i] != 0 || p.coefficient[j] != 0)) {
                    this.coefficient[i] -= p.coefficient[j];
                }
            }
        }
        return this;
    }

    // Multiply two polynomials and returns a new polynomial which has result
    public Polynomial multiply(Polynomial p) {
        Polynomial a = new Polynomial();

        for (int i = 0; i < this.coefficient.length / 2; i++) {
            for (int j = 0; j < p.coefficient.length / 2; j++) {

                a.coefficient[(i + j)] += this.coefficient[i] * p.coefficient[j];

            }

        }
        return a;
    }

}