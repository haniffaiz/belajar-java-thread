package programmer.zaman.now.thread;

public class SynchronizedCounter {

    private Long value = 0L;

    //memaksa 1 thread (synchronized)
    public void increment(){

        synchronized (this){
            value++;
        }

    }

    public Long getValue(){
        return value;
    }
}
