package task1;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        double resultAmount = purchaseAmount - ((double) discountAmount / 100 * purchaseAmount);
        if (purchaseAmount < 1)
            throw new IllegalArgumentException("Стоимость меньше 1 рубля");
        if (discountAmount < 0) throw new IllegalArgumentException("Скидка не корректная(отрицательная)");
        return resultAmount;
    }

}
