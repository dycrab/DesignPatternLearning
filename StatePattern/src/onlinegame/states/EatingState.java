package onlinegame.states;

import onlinegame.contexts.OnlineContext;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class EatingState extends OnlineState {

    public void afterEatingWaiting(OnlineContext onlineContext) {
        System.out.println("after eating waiting");
        onlineContext.setOnlineState(new WaitingState());
    }
}
