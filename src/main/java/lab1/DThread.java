package lab1;

// Watek, ktory dekrementuje licznik 100.000 razy
class DThread extends Thread {

    private Counter counter;

    public DThread(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run(){
        for(int i=0; i <100000; i++)
            counter.dec();
    }

//    private final Lock lock;
//
//    public DThread(Lock lock){
//        this.lock = lock;
//    }
//
//    @Override
//    public void run(){
//        for(int i=0; i <100000; i++){
//            while (lock.tryLock()){
//                lock.counter.dec();
//            }
//            lock.unlock();
//       }
//    }
}

