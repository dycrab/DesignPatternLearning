package onlinegame.states;

import onlinegame.contexts.OnlineContext;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class WaitingState extends OnlineState {

    public void ready(OnlineContext onlineContext){
        System.out.println("all people ready");
        onlineContext.setOnlineState(new AllReadyState());
    }
}
