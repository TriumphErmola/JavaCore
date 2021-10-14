package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

public class ExchangerEx {
    public static void main(String[] args) {
        Exchanger<Action> exchanger = new Exchanger<>();
        List<Action> friend1 = new ArrayList<>();
        friend1.add(Action.NOJNICI);
        friend1.add(Action.BUMAGA);
        friend1.add(Action.NOJNICI);

        List<Action> friend2 = new ArrayList<>();
        friend2.add(Action.BUMAGA);
        friend2.add(Action.KAMEN);
        friend2.add(Action.KAMEN);

        new BestFriend("Vany",friend1,exchanger);
        new BestFriend("Pety",friend2,exchanger);


    }
}

enum Action {
    KAMEN, NOJNICI, BUMAGA;
}

class BestFriend extends Thread {
    private String name;
    private List<Action> myActions;
    private Exchanger<Action> exchanger;

    public BestFriend(String name, List<Action> myActions, Exchanger<Action> exchanger) {
        this.name = name;
        this.myActions = myActions;
        this.exchanger = exchanger;
        this.start();
    }

    private void whoWins(Action myActions, Action friendsAction) {
        if ((myActions == Action.KAMEN && friendsAction == Action.NOJNICI)
                || (myActions == Action.NOJNICI && friendsAction == Action.BUMAGA)
                || (myActions == Action.BUMAGA && friendsAction == Action.KAMEN)) {
            System.out.println(name + " WINS!!!");
        }
    }

    public void run() {
        Action reply;
        for (Action action : myActions) {
            try {
                reply = exchanger.exchange(action);
                whoWins(action, reply);
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

