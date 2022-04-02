package lab1;


public class Race {
    public static void main(String[] args){

        int ctr = 0;

        for(int i=0; i<100; i++){
            Counter cnt = new Counter(0);
//            Lock lock = new Lock(cnt);
//            DThread dThread = new DThread(lock);
//            IThread iThread = new IThread(lock);

            DThread dThread = new DThread(cnt);
            IThread iThread = new IThread(cnt);

            dThread.start();
            iThread.start();

            try {
                dThread.join();
                iThread.join();
            } catch (InterruptedException ex){
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
            System.out.println("stan=" + cnt.value());
            if(cnt.value() == 0)
                ctr++;
        }
        System.out.println(ctr);
    }
}



