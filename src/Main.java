

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList <String> teams = new ArrayList<>();

        teams.add("GS");
        teams.add("Fenerbahçe");
       teams.add("TS");
       teams.add("Bursaspor");
       teams.add("BJK");
        teams.add("Başakşehir");


        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }
        Fixture fixture = new Fixture(teams);


        System.out.println(fixture.generateFixtures());








    }


}
