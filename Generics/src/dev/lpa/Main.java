package dev.lpa;

interface Player {
}

record BaseballPlayer(String name, String position) implements Player {
}

record FootballPlayer(String name, String position) implements Player {
}

/**
 * Generic classes cant be used with primitive types, use autoboxing
 */

public class Main {
  public static void main(String[] args) {

    var philly = new Affiliation("city", "Philadelphia, PA", "US");

    Team<BaseballPlayer, Affiliation> phillies = new Team<>("Philedelphia Phillies", philly);
    Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros");
    scoreResult(phillies, 2, astros, 1);

    var harper = new BaseballPlayer("B Harper", "Right Fielder");
    var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
    phillies.addTeamMember(harper);
    phillies.addTeamMember(marsh);
    phillies.listTeamMembers();

    Team<FootballPlayer, Affiliation> afc = new Team<>("Adelaide Crows");
    var tex = new FootballPlayer("Tex Walker", "Centre half forward");
    var rory = new FootballPlayer("Rory Laird", "Midfield");
    afc.addTeamMember(tex);
    afc.addTeamMember(rory);
    // afc.addTeamMember(harper); will not compile because harper is a baseball
    // player, thanks to generics
    afc.listTeamMembers();

    /**
     * Testing the generic with String type
     * It will compile and work since we did not set an upper bound for generic
     * Wont compile after adding `T extends Player` generic to the Team Class
     */
    // Team<String> adelaide = new Team<>("Adelaide");
    // adelaide.addTeamMember("N Roberts");
    // adelaide.listTeamMembers();

  }

  public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score) {
    String message = team1.setScore(t1_score, t2_score);
    team2.setScore(t1_score, t2_score);

    System.out.printf("%s %s %s %n", team1, message, team2);
  }
}
