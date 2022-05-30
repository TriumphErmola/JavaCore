package MasterClass.Generics;

public class Main {

    public static void main(String[] args) {

        FootballPlayer andrey = new FootballPlayer("Andrey");
        SoccerPlayer tim = new SoccerPlayer("Tim");
        BaseballPlayer john = new BaseballPlayer("John");

        Team<FootballPlayer> footballPlayerTeam = new Team<>("Gazmys");
        footballPlayerTeam.addPlayer(andrey);


        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Omichka");
        baseballPlayerTeam.addPlayer(john);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Tobol");
        soccerPlayerTeam.addPlayer(tim);

    }
}
