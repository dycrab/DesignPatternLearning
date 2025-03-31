package onlinegame.states;

import onlinegame.contexts.OnlineContext;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class AllReadyState extends OnlineState {

    public void startGame(OnlineContext onlineContext) {
        System.out.println("start game");
        onlineContext.setOnlineState(new AfterGameState());
    }
}
