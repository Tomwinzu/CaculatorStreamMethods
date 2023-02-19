package CaculatorStreamMethods.CaculatorStreamMethods.service;

public class Calculator {

    private int max;
    private int divisor;
    private int limit;

    public Calculator() {
    }

    public Calculator(int max, int divisor, int limit) {
        this.max = max;
        this.divisor = divisor;
        this.limit = limit;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
