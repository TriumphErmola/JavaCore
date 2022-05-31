package MasterClass.Generics.Challenge;

import MasterClass.Generics.FootballPlayer;

public class Main {
    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballLeague = new League<>("PFL");

        FootballPlayer andrey = new FootballPlayer("Andrey");
        FootballPlayer david = new FootballPlayer("David");
        FootballPlayer petr = new FootballPlayer("Petr");

        Team<FootballPlayer> footballPlayerTeam = new Team<>("Gazmys");
        footballPlayerTeam.addPlayer(andrey);

        Team<FootballPlayer> footballPlayerTeam1 = new Team<>("Orsk");
        footballPlayerTeam1.addPlayer(david);

        Team<FootballPlayer> footballPlayerTeam3 = new Team<>("Gaz");
        footballPlayerTeam3.addPlayer(petr);

        footballLeague.add(footballPlayerTeam);
        footballLeague.add(footballPlayerTeam1);
        footballLeague.add(footballPlayerTeam3);

        footballLeague.showLeagueTable();


    }
}
