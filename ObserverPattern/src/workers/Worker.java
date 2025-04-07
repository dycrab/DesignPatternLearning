package workers;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-04-07
 */
public interface Worker {

    public void work(String workType, Boolean isOverWork);
}
