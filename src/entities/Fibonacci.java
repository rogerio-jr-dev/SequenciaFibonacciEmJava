package entities;

public class Fibonacci {

    public Fibonacci() {
    }

    // Método de verificação da formula
    public boolean isFibonacci(int num) {
        if (num == 0 || num == 1) {
            return true;
        }

        int a = 0, b = 1;
        int nextFib = a + b;

        while (nextFib <= num) {
            if (nextFib == num) {
                return true;
            }
            a = b;
            b = nextFib;
            nextFib = a + b;
        }
        return false;
    }
}
