package lesson1.Competitors;

public class Team {
    private String name;
    private Competitor [] competitors;

    public Team (String name, Competitor ... competitors){
        this.name = name;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResult(){
        System.out.println("Team: " + name);
        for(Competitor c: competitors){
            if(c.isOnDistance()){
                c.showResult();
            }
        }
    }
}
