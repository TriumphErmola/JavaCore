package MasterClass.Concurrency.LiveLocks;



public class ResourceForShared {
    private ThreadWorker owner;


    public ResourceForShared(ThreadWorker owner) {
        this.owner = owner;
    }

    public ThreadWorker getOwner() {
        return owner;
    }

    public synchronized void setOwner(ThreadWorker owner) {
        this.owner = owner;
    }
}
