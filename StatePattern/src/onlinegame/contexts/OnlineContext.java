package onlinegame.contexts;

import onlinegame.states.AfterGameState;
import onlinegame.states.AllReadyState;
import onlinegame.states.EatingState;
import onlinegame.states.OnlineState;
import onlinegame.states.OopzState;
import onlinegame.states.StartState;
import onlinegame.states.WaitingState;

/**
 * 功能描述
 *
 * @author z30072591
 * @since 2025-03-31
 */
public class OnlineContext {
    OnlineState onlineState;

    public OnlineContext(){
        onlineState = new StartState();
    }

    public void setOnlineState(OnlineState onlineState) {
        this.onlineState = onlineState;
    }

    public void joinOopz() {
        ((StartState)onlineState).joinOopz(this);
    }

    public void waiting() {
        ((OopzState)onlineState).waiting(this);
    }

    public void ready() {
        ((WaitingState)onlineState).ready(this);
    }

    public void startGame() {
        ((AllReadyState)onlineState).startGame(this);
    }

    public void afterGameEating() {
        ((AfterGameState)onlineState).eating(this);
    }

    public void afterGameWaiting() {
        ((AfterGameState)onlineState).waiting(this);
    }

    public void afterEatingWaiting() {
        ((EatingState)onlineState).afterEatingWaiting(this);
    }

    public void resting() {
        ((AfterGameState)onlineState).end(this);
    }
}
