package lab1;

import java.util.concurrent.atomic.AtomicBoolean;

public class Lock{

    public Counter counter;
    AtomicBoolean isLock;

    Lock(Counter counter) {
        this.counter = counter;
        this.isLock  = new AtomicBoolean(false);
    }

    public boolean tryLock() {
        if(!isLock.get())
        {
            lock();
            return true;
        }
        return false;
    }

    private void lock(){
        this.isLock.compareAndSet(false, true);
    }

    public void unlock(){
        this.isLock.compareAndSet(true, false);
    }
}
