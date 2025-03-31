package onlinegame.states;

import onlinegame.contexts.OnlineContext;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class OopzState extends OnlineState{

    public void waiting(OnlineContext onlineContext) {
        System.out.println("waiting people");
        onlineContext.setOnlineState(new WaitingState());
    }
}
