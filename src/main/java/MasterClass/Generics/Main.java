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

        Team<FootballPlayer> footballPlayerTeam1 = new Team<>("Orsk");
        FootballPlayer david = new FootballPlayer("David");
        footballPlayerTeam1.addPlayer(david);

        Team<FootballPlayer> footballPlayerTeam3 = new Team<>("Gaz");

        footballPlayerTeam.matchResult(footballPlayerTeam1,10,15);
        footballPlayerTeam.matchResult(footballPlayerTeam3,5,20);

        System.out.println(footballPlayerTeam.compareTo(footballPlayerTeam3));
        System.out.println(footballPlayerTeam.compareTo(footballPlayerTeam1));



    }
}
