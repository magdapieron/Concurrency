package lab1;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger _val;

    public Counter(int n) {
        _val = new AtomicInteger(n);
    }

    public void inc() {
        _val.incrementAndGet();
    }

    public void dec() {
        _val.decrementAndGet();
    }

    public int value() {
        return _val.intValue();
    }
}
