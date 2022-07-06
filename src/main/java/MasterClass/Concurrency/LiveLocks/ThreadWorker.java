package MasterClass.Concurrency.LiveLocks;

public class ThreadWorker {

    private String name;
    private boolean active;

    public ThreadWorker(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public synchronized void opatRabota(ResourceForShared resourceForShared, ThreadWorker threadWorker) {
        while (active) {
            if (resourceForShared.getOwner() != this) {
                try {
                    wait();
                } catch (InterruptedException exp) {

                }
                continue;
            }
            if (threadWorker.isActive()) {
                System.out.println(getName() + " : give the resource to the worker " + threadWorker.getName());
                resourceForShared.setOwner(threadWorker);
                continue;
            }
            System.out.println(getName() + ": working on the cummom resource");
            active = false;
            resourceForShared.setOwner(threadWorker);
        }
    }

}
