package workers;

import projects.Project;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-04-07
 */
public class Work1 implements Worker, WorkState {

    private Project project;

    private String workType;

    private Boolean isOverWork;

    public Work1(Project project) {
        this.project = project;
        project.addWorker(this);
    }

    @Override
    public void work(String workType, Boolean isOverWork) {
        this.workType = workType;
        this.isOverWork = isOverWork;
        stateCheck();
    }

    @Override
    public void stateCheck() {
        System.out.println("workType: "+workType+", isOverWork: "+isOverWork);
    }
}
