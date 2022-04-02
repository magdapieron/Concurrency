package lab1;

// Watek, ktory inkrementuje licznik 100.000 razy
class IThread extends Thread {

    private Counter counter;

    public IThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++)
            counter.inc();
    }

//    private final Lock lock;
//
//    public IThread(Lock lock){
//        this.lock = lock;
//    }
//
//    @Override
//    public void run(){
//        for(int i=0; i <100000; i++) {
//            while (lock.tryLock()) {
//                lock.counter.inc();
//            }
//            lock.unlock();
//        }
//    }
}



