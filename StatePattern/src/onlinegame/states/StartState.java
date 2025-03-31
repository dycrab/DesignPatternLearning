package onlinegame.states;

import onlinegame.contexts.OnlineContext;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class StartState extends OnlineState {

    public void joinOopz(OnlineContext onlineContext) {
        System.out.println("join oopz");
        onlineContext.setOnlineState(new OopzState());
    }
}
