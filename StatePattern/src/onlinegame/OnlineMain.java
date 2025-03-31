package onlinegame;

import onlinegame.contexts.OnlineContext;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class OnlineMain {
    public static void main(String[] args) {
        OnlineContext onlineContext = new OnlineContext();

        onlineContext.joinOopz();
        onlineContext.waiting();
        onlineContext.ready();
        onlineContext.startGame();
        onlineContext.afterGameWaiting();
        onlineContext.ready();
        onlineContext.startGame();
        onlineContext.afterGameEating();
        onlineContext.afterEatingWaiting();
        onlineContext.ready();
        onlineContext.startGame();
        onlineContext.resting();

    }
}
