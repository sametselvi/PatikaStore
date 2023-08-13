import java.util.*;

public class Fixture {
    private List<String> teams;

    public Fixture(List<String> teams){
        this.teams= teams;
    }


    public List<String> generateFixtures(){
        List<String> fixtures = new ArrayList<>();




        List<String> shuffledTeams = new ArrayList<>(teams);

        for(int dist = 1; dist < shuffledTeams.size(); dist++){

            for(int i = 0; i + dist < shuffledTeams.size(); i++){
                System.out.println(shuffledTeams.get(i) + " - " + shuffledTeams.get(i+dist));
            }
        }
        System.out.println("---------------Deplasmanları--------");
        for(int a = 1; a < shuffledTeams.size(); a++){
            for(int i = 0; i + a < shuffledTeams.size(); i++){

                System.out.println(shuffledTeams.get(i+a) + " - " + shuffledTeams.get(i) );

            }
        }


        return shuffledTeams;
    }

}
