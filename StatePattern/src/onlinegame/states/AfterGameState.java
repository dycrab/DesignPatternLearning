package onlinegame.states;

import onlinegame.contexts.OnlineContext;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class AfterGameState extends OnlineState {

    public void eating(OnlineContext onlineContext) {
        System.out.println("eating");
        onlineContext.setOnlineState(new EatingState());
    }

    public void waiting(OnlineContext onlineContext) {
        System.out.println("waiting people");
        onlineContext.setOnlineState(new WaitingState());
    }

    public void end(OnlineContext onlineContext) {
        System.out.println("end");
        onlineContext.setOnlineState(new EndState());
    }
}
