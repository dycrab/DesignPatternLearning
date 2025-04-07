package projects;

import workers.Worker;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-04-07
 */
public class BoHaiBank implements Project {

    public String workType;

    public Boolean isOverWork;

    @Override
    public void addWorker(Worker worker) {
        workers.add(worker);
    }

    @Override
    public void removeWorker(Worker worker) {
        workers.remove(worker);
    }

    @Override
    public void notifyWorkers() {
        for (Worker worker:workers) {
            worker.work(workType,isOverWork);
        }
    }

    public void changeWorkState(String workType, Boolean isOverWork){
        this.workType = workType;
        this.isOverWork = isOverWork;
    }
}
