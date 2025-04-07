package projects;

import java.util.ArrayList;
import java.util.List;

import workers.Worker;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-04-07
 */
public interface Project {

    List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) ;

    public void removeWorker(Worker worker);

    public void notifyWorkers();
}
