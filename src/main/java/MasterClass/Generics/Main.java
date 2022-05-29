package MasterClass.Generics;

public class Main {

    public static void main(String[] args) {

        FootballPlayer andrey = new FootballPlayer("Andrey");
        SoccerPlayer tim = new SoccerPlayer("Tim");
        BaseballPlayer john = new BaseballPlayer("John");

        Team gazmys = new Team("Gazmys");
        gazmys.addPlayer(andrey);
        gazmys.addPlayer(tim);
        gazmys.addPlayer(john);

        System.out.println(gazmys.numPlayers());
    }
}
